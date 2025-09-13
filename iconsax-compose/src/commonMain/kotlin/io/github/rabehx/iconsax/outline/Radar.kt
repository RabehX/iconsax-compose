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

val Iconsax.Outline.Radar: ImageVector
    get() {
        if (_Radar != null) {
            return _Radar!!
        }
        _Radar = ImageVector.Builder(
            name = "Outline.Radar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(6.07f, 22.75f, 1.25f, 17.93f, 1.25f, 12f)
                curveTo(1.25f, 10.12f, 1.74f, 8.27f, 2.68f, 6.64f)
                curveTo(2.89f, 6.28f, 3.34f, 6.16f, 3.7f, 6.36f)
                lineTo(12.37f, 11.34f)
                curveTo(12.73f, 11.55f, 12.85f, 12f, 12.65f, 12.36f)
                curveTo(12.44f, 12.72f, 11.99f, 12.84f, 11.63f, 12.64f)
                lineTo(3.63f, 8.05f)
                curveTo(3.05f, 9.28f, 2.75f, 10.62f, 2.75f, 11.99f)
                curveTo(2.75f, 17.09f, 6.9f, 21.24f, 12f, 21.24f)
                curveTo(17.1f, 21.24f, 21.25f, 17.09f, 21.25f, 11.99f)
                curveTo(21.25f, 6.89f, 17.1f, 2.74f, 12f, 2.74f)
                curveTo(9.98f, 2.74f, 8.06f, 3.38f, 6.45f, 4.59f)
                curveTo(6.12f, 4.84f, 5.65f, 4.77f, 5.4f, 4.44f)
                curveTo(5.15f, 4.11f, 5.22f, 3.64f, 5.55f, 3.39f)
                curveTo(7.42f, 1.99f, 9.65f, 1.24f, 12f, 1.24f)
                curveTo(17.93f, 1.24f, 22.75f, 6.06f, 22.75f, 11.99f)
                curveTo(22.75f, 17.92f, 17.93f, 22.75f, 12f, 22.75f)
                close()
            }
        }.build()

        return _Radar!!
    }

@Suppress("ObjectPropertyName")
private var _Radar: ImageVector? = null
