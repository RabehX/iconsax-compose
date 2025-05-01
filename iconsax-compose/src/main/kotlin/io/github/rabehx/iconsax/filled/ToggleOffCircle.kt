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


val Iconsax.Filled.ToggleOffCircle: ImageVector
    get() {
        if (_ToggleOffCircle != null) {
            return _ToggleOffCircle!!
        }
        _ToggleOffCircle = ImageVector.Builder(
            name = "Filled.ToggleOffCircle",
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
                moveTo(10.14f, 16.419f)
                curveTo(7.7f, 16.419f, 5.72f, 14.439f, 5.72f, 11.999f)
                curveTo(5.72f, 9.559f, 7.7f, 7.579f, 10.14f, 7.579f)
                curveTo(12.58f, 7.579f, 14.56f, 9.559f, 14.56f, 11.999f)
                curveTo(14.56f, 14.439f, 12.58f, 16.419f, 10.14f, 16.419f)
                close()
            }
        }.build()

        return _ToggleOffCircle!!
    }

@Suppress("ObjectPropertyName")
private var _ToggleOffCircle: ImageVector? = null
