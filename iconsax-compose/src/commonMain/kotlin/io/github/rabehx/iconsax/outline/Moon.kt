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

val Iconsax.Outline.Moon: ImageVector
    get() {
        if (_Moon != null) {
            return _Moon!!
        }
        _Moon = ImageVector.Builder(
            name = "Outline.Moon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.46f, 22.75f)
                curveTo(12.29f, 22.75f, 12.12f, 22.75f, 11.95f, 22.74f)
                curveTo(6.35f, 22.49f, 1.67f, 17.98f, 1.28f, 12.48f)
                curveTo(0.94f, 7.76f, 3.67f, 3.35f, 8.07f, 1.5f)
                curveTo(9.32f, 0.98f, 9.98f, 1.38f, 10.26f, 1.67f)
                curveTo(10.54f, 1.95f, 10.93f, 2.6f, 10.41f, 3.79f)
                curveTo(9.95f, 4.85f, 9.72f, 5.98f, 9.73f, 7.14f)
                curveTo(9.75f, 11.57f, 13.43f, 15.33f, 17.92f, 15.51f)
                curveTo(18.57f, 15.54f, 19.21f, 15.49f, 19.83f, 15.38f)
                curveTo(21.15f, 15.14f, 21.7f, 15.67f, 21.91f, 16.01f)
                curveTo(22.12f, 16.35f, 22.36f, 17.08f, 21.56f, 18.16f)
                curveTo(19.44f, 21.06f, 16.07f, 22.75f, 12.46f, 22.75f)
                close()
                moveTo(2.77f, 12.37f)
                curveTo(3.11f, 17.13f, 7.17f, 21.03f, 12.01f, 21.24f)
                curveTo(15.3f, 21.4f, 18.42f, 19.9f, 20.34f, 17.28f)
                curveTo(20.49f, 17.07f, 20.56f, 16.92f, 20.59f, 16.84f)
                curveTo(20.5f, 16.83f, 20.34f, 16.82f, 20.09f, 16.87f)
                curveTo(19.36f, 17f, 18.6f, 17.05f, 17.85f, 17.02f)
                curveTo(12.57f, 16.81f, 8.25f, 12.38f, 8.22f, 7.16f)
                curveTo(8.22f, 5.78f, 8.49f, 4.45f, 9.04f, 3.2f)
                curveTo(9.14f, 2.98f, 9.16f, 2.83f, 9.17f, 2.75f)
                curveTo(9.08f, 2.75f, 8.92f, 2.77f, 8.66f, 2.88f)
                curveTo(4.85f, 4.48f, 2.49f, 8.3f, 2.77f, 12.37f)
                close()
            }
        }.build()

        return _Moon!!
    }

@Suppress("ObjectPropertyName")
private var _Moon: ImageVector? = null
