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


val Iconsax.Filled.VolumeCross: ImageVector
    get() {
        if (_VolumeCross != null) {
            return _VolumeCross!!
        }
        _VolumeCross = ImageVector.Builder(
            name = "Filled.VolumeCross",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22.531f, 13.42f)
                lineTo(21.081f, 11.97f)
                lineTo(22.481f, 10.57f)
                curveTo(22.771f, 10.28f, 22.771f, 9.8f, 22.481f, 9.51f)
                curveTo(22.191f, 9.22f, 21.711f, 9.22f, 21.421f, 9.51f)
                lineTo(20.021f, 10.91f)
                lineTo(18.571f, 9.46f)
                curveTo(18.281f, 9.17f, 17.801f, 9.17f, 17.511f, 9.46f)
                curveTo(17.221f, 9.75f, 17.221f, 10.23f, 17.511f, 10.52f)
                lineTo(18.961f, 11.97f)
                lineTo(17.471f, 13.46f)
                curveTo(17.181f, 13.75f, 17.181f, 14.23f, 17.471f, 14.52f)
                curveTo(17.621f, 14.67f, 17.811f, 14.74f, 18.001f, 14.74f)
                curveTo(18.191f, 14.74f, 18.381f, 14.67f, 18.531f, 14.52f)
                lineTo(20.021f, 13.03f)
                lineTo(21.471f, 14.48f)
                curveTo(21.621f, 14.63f, 21.811f, 14.7f, 22.001f, 14.7f)
                curveTo(22.191f, 14.7f, 22.381f, 14.63f, 22.531f, 14.48f)
                curveTo(22.821f, 14.19f, 22.821f, 13.72f, 22.531f, 13.42f)
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

        return _VolumeCross!!
    }

@Suppress("ObjectPropertyName")
private var _VolumeCross: ImageVector? = null
