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


val Iconsax.Filled.Data: ImageVector
    get() {
        if (_Data != null) {
            return _Data!!
        }
        _Data = ImageVector.Builder(
            name = "Filled.Data",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20f, 14.25f)
                curveTo(21.243f, 14.25f, 22.25f, 13.243f, 22.25f, 12f)
                curveTo(22.25f, 10.757f, 21.243f, 9.75f, 20f, 9.75f)
                curveTo(18.757f, 9.75f, 17.75f, 10.757f, 17.75f, 12f)
                curveTo(17.75f, 13.243f, 18.757f, 14.25f, 20f, 14.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20f, 6.25f)
                curveTo(21.243f, 6.25f, 22.25f, 5.243f, 22.25f, 4f)
                curveTo(22.25f, 2.757f, 21.243f, 1.75f, 20f, 1.75f)
                curveTo(18.757f, 1.75f, 17.75f, 2.757f, 17.75f, 4f)
                curveTo(17.75f, 5.243f, 18.757f, 6.25f, 20f, 6.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20f, 22.25f)
                curveTo(21.243f, 22.25f, 22.25f, 21.243f, 22.25f, 20f)
                curveTo(22.25f, 18.757f, 21.243f, 17.75f, 20f, 17.75f)
                curveTo(18.757f, 17.75f, 17.75f, 18.757f, 17.75f, 20f)
                curveTo(17.75f, 21.243f, 18.757f, 22.25f, 20f, 22.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4f, 14.25f)
                curveTo(5.243f, 14.25f, 6.25f, 13.243f, 6.25f, 12f)
                curveTo(6.25f, 10.757f, 5.243f, 9.75f, 4f, 9.75f)
                curveTo(2.757f, 9.75f, 1.75f, 10.757f, 1.75f, 12f)
                curveTo(1.75f, 13.243f, 2.757f, 14.25f, 4f, 14.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 12.75f)
                curveTo(19.41f, 12.75f, 19.75f, 12.41f, 19.75f, 12f)
                curveTo(19.75f, 11.59f, 19.41f, 11.25f, 19f, 11.25f)
                horizontalLineTo(11.75f)
                verticalLineTo(7f)
                curveTo(11.75f, 5.42f, 12.42f, 4.75f, 14f, 4.75f)
                horizontalLineTo(19f)
                curveTo(19.41f, 4.75f, 19.75f, 4.41f, 19.75f, 4f)
                curveTo(19.75f, 3.59f, 19.41f, 3.25f, 19f, 3.25f)
                horizontalLineTo(14f)
                curveTo(11.58f, 3.25f, 10.25f, 4.58f, 10.25f, 7f)
                verticalLineTo(11.25f)
                horizontalLineTo(5f)
                curveTo(4.59f, 11.25f, 4.25f, 11.59f, 4.25f, 12f)
                curveTo(4.25f, 12.41f, 4.59f, 12.75f, 5f, 12.75f)
                horizontalLineTo(10.25f)
                verticalLineTo(17f)
                curveTo(10.25f, 19.42f, 11.58f, 20.75f, 14f, 20.75f)
                horizontalLineTo(19f)
                curveTo(19.41f, 20.75f, 19.75f, 20.41f, 19.75f, 20f)
                curveTo(19.75f, 19.59f, 19.41f, 19.25f, 19f, 19.25f)
                horizontalLineTo(14f)
                curveTo(12.42f, 19.25f, 11.75f, 18.58f, 11.75f, 17f)
                verticalLineTo(12.75f)
                horizontalLineTo(19f)
                close()
            }
        }.build()

        return _Data!!
    }

@Suppress("ObjectPropertyName")
private var _Data: ImageVector? = null
