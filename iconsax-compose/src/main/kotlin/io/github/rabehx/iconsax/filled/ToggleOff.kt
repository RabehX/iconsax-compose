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


val Iconsax.Filled.ToggleOff: ImageVector
    get() {
        if (_ToggleOff != null) {
            return _ToggleOff!!
        }
        _ToggleOff = ImageVector.Builder(
            name = "Filled.ToggleOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.65f, 3.859f)
                horizontalLineTo(7.35f)
                curveTo(3.25f, 3.859f, 2f, 5.109f, 2f, 9.209f)
                verticalLineTo(14.789f)
                curveTo(2f, 18.889f, 3.25f, 20.139f, 7.35f, 20.139f)
                horizontalLineTo(16.65f)
                curveTo(20.75f, 20.139f, 22f, 18.889f, 22f, 14.789f)
                verticalLineTo(9.209f)
                curveTo(22f, 5.109f, 20.75f, 3.859f, 16.65f, 3.859f)
                close()
                moveTo(14.09f, 13.119f)
                curveTo(14.09f, 15.369f, 13.04f, 16.419f, 10.79f, 16.419f)
                horizontalLineTo(8.56f)
                curveTo(6.31f, 16.419f, 5.26f, 15.369f, 5.26f, 13.119f)
                verticalLineTo(10.889f)
                curveTo(5.26f, 8.639f, 6.31f, 7.589f, 8.56f, 7.589f)
                horizontalLineTo(10.79f)
                curveTo(13.04f, 7.589f, 14.09f, 8.639f, 14.09f, 10.889f)
                verticalLineTo(13.119f)
                close()
            }
        }.build()

        return _ToggleOff!!
    }

@Suppress("ObjectPropertyName")
private var _ToggleOff: ImageVector? = null
