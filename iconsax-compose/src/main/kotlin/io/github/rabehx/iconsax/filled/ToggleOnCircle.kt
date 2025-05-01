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


val Iconsax.Filled.ToggleOnCircle: ImageVector
    get() {
        if (_ToggleOnCircle != null) {
            return _ToggleOnCircle!!
        }
        _ToggleOnCircle = ImageVector.Builder(
            name = "Filled.ToggleOnCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.86f, 3.859f)
                horizontalLineTo(10.14f)
                curveTo(5.65f, 3.859f, 2f, 7.509f, 2f, 11.999f)
                curveTo(2f, 16.489f, 5.65f, 20.139f, 10.14f, 20.139f)
                horizontalLineTo(13.86f)
                curveTo(18.35f, 20.139f, 22f, 16.489f, 22f, 11.999f)
                curveTo(22f, 7.509f, 18.35f, 3.859f, 13.86f, 3.859f)
                close()
                moveTo(13.86f, 16.419f)
                curveTo(11.42f, 16.419f, 9.44f, 14.439f, 9.44f, 11.999f)
                curveTo(9.44f, 9.559f, 11.42f, 7.579f, 13.86f, 7.579f)
                curveTo(16.3f, 7.579f, 18.28f, 9.559f, 18.28f, 11.999f)
                curveTo(18.28f, 14.439f, 16.3f, 16.419f, 13.86f, 16.419f)
                close()
            }
        }.build()

        return _ToggleOnCircle!!
    }

@Suppress("ObjectPropertyName")
private var _ToggleOnCircle: ImageVector? = null
