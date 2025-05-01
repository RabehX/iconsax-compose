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

package io.github.rabehx.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.ToggleOnCircle: ImageVector
    get() {
        if (_ToggleOnCircle != null) {
            return _ToggleOnCircle!!
        }
        _ToggleOnCircle = ImageVector.Builder(
            name = "Outline.ToggleOnCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14f, 20.75f)
                horizontalLineTo(10f)
                curveTo(5.17f, 20.75f, 1.25f, 16.82f, 1.25f, 12f)
                curveTo(1.25f, 7.18f, 5.17f, 3.25f, 10f, 3.25f)
                horizontalLineTo(14f)
                curveTo(18.83f, 3.25f, 22.75f, 7.18f, 22.75f, 12f)
                curveTo(22.75f, 16.82f, 18.83f, 20.75f, 14f, 20.75f)
                close()
                moveTo(10f, 4.75f)
                curveTo(6f, 4.75f, 2.75f, 8f, 2.75f, 12f)
                curveTo(2.75f, 16f, 6f, 19.25f, 10f, 19.25f)
                horizontalLineTo(14f)
                curveTo(18f, 19.25f, 21.25f, 16f, 21.25f, 12f)
                curveTo(21.25f, 8f, 18f, 4.75f, 14f, 4.75f)
                horizontalLineTo(10f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14f, 16.75f)
                curveTo(11.38f, 16.75f, 9.25f, 14.62f, 9.25f, 12f)
                curveTo(9.25f, 9.38f, 11.38f, 7.25f, 14f, 7.25f)
                curveTo(16.62f, 7.25f, 18.75f, 9.38f, 18.75f, 12f)
                curveTo(18.75f, 14.62f, 16.62f, 16.75f, 14f, 16.75f)
                close()
                moveTo(14f, 8.75f)
                curveTo(12.21f, 8.75f, 10.75f, 10.21f, 10.75f, 12f)
                curveTo(10.75f, 13.79f, 12.21f, 15.25f, 14f, 15.25f)
                curveTo(15.79f, 15.25f, 17.25f, 13.79f, 17.25f, 12f)
                curveTo(17.25f, 10.21f, 15.79f, 8.75f, 14f, 8.75f)
                close()
            }
        }.build()

        return _ToggleOnCircle!!
    }

@Suppress("ObjectPropertyName")
private var _ToggleOnCircle: ImageVector? = null
