/*
 *
 *  * Copyright (c) 2025, Рабeх Аззам
 *  *
 *  * This file is part of Iconsax Compose.
 *  *
 *  * Iconsax Compose is free software: you can redistribute it and/or modify
 *  * it under the terms of the GNU General Public License as published by
 *  * the Free Software Foundation, either version 3 of the License, or
 *  * (at your option) any later version.
 *  *
 *  * Iconsax Compose is distributed in the hope that it will be useful,
 *  * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  * GNU General Public License for more details.
 *  *
 *  * You should have received a copy of the GNU General Public License
 *  * along with Iconsax Compose. If not, see <https://www.gnu.org/licenses/>.
 *
 */

package io.github.rabehx.iconsax.filled


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax


val Iconsax.Filled.VolumeLow: ImageVector
    get() {
        if (_VolumeLow != null) {
            return _VolumeLow!!
        }
        _VolumeLow = ImageVector.Builder(
            name = "Filled.VolumeLow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 12.75f)
                horizontalLineTo(18f)
                curveTo(17.59f, 12.75f, 17.25f, 12.41f, 17.25f, 12f)
                curveTo(17.25f, 11.59f, 17.59f, 11.25f, 18f, 11.25f)
                horizontalLineTo(22f)
                curveTo(22.41f, 11.25f, 22.75f, 11.59f, 22.75f, 12f)
                curveTo(22.75f, 12.41f, 22.41f, 12.75f, 22f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.02f, 3.782f)
                curveTo(12.9f, 3.162f, 11.47f, 3.322f, 10.01f, 4.232f)
                lineTo(7.09f, 6.062f)
                curveTo(6.89f, 6.182f, 6.66f, 6.252f, 6.43f, 6.252f)
                horizontalLineTo(5.5f)
                horizontalLineTo(5f)
                curveTo(2.58f, 6.252f, 1.25f, 7.582f, 1.25f, 10.002f)
                verticalLineTo(14.002f)
                curveTo(1.25f, 16.422f, 2.58f, 17.752f, 5f, 17.752f)
                horizontalLineTo(5.5f)
                horizontalLineTo(6.43f)
                curveTo(6.66f, 17.752f, 6.89f, 17.822f, 7.09f, 17.942f)
                lineTo(10.01f, 19.772f)
                curveTo(10.89f, 20.322f, 11.75f, 20.592f, 12.55f, 20.592f)
                curveTo(13.07f, 20.592f, 13.57f, 20.472f, 14.02f, 20.222f)
                curveTo(15.13f, 19.602f, 15.75f, 18.312f, 15.75f, 16.592f)
                verticalLineTo(7.412f)
                curveTo(15.75f, 5.692f, 15.13f, 4.402f, 14.02f, 3.782f)
                close()
            }
        }.build()

        return _VolumeLow!!
    }

@Suppress("ObjectPropertyName")
private var _VolumeLow: ImageVector? = null
