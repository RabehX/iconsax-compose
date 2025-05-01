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

val Iconsax.Outline.Global: ImageVector
    get() {
        if (_Global != null) {
            return _Global!!
        }
        _Global = ImageVector.Builder(
            name = "Outline.Global",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(6.07f, 22.75f, 1.25f, 17.93f, 1.25f, 12f)
                curveTo(1.25f, 6.07f, 6.07f, 1.25f, 12f, 1.25f)
                curveTo(17.93f, 1.25f, 22.75f, 6.07f, 22.75f, 12f)
                curveTo(22.75f, 17.93f, 17.93f, 22.75f, 12f, 22.75f)
                close()
                moveTo(12f, 2.75f)
                curveTo(6.9f, 2.75f, 2.75f, 6.9f, 2.75f, 12f)
                curveTo(2.75f, 17.1f, 6.9f, 21.25f, 12f, 21.25f)
                curveTo(17.1f, 21.25f, 21.25f, 17.1f, 21.25f, 12f)
                curveTo(21.25f, 6.9f, 17.1f, 2.75f, 12f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9f, 21.75f)
                horizontalLineTo(8f)
                curveTo(7.59f, 21.75f, 7.25f, 21.41f, 7.25f, 21f)
                curveTo(7.25f, 20.59f, 7.57f, 20.26f, 7.98f, 20.25f)
                curveTo(6.41f, 14.89f, 6.41f, 9.11f, 7.98f, 3.75f)
                curveTo(7.57f, 3.74f, 7.25f, 3.41f, 7.25f, 3f)
                curveTo(7.25f, 2.59f, 7.59f, 2.25f, 8f, 2.25f)
                horizontalLineTo(9f)
                curveTo(9.24f, 2.25f, 9.47f, 2.37f, 9.61f, 2.56f)
                curveTo(9.75f, 2.76f, 9.79f, 3.01f, 9.71f, 3.24f)
                curveTo(7.83f, 8.89f, 7.83f, 15.11f, 9.71f, 20.77f)
                curveTo(9.79f, 21f, 9.75f, 21.25f, 9.61f, 21.45f)
                curveTo(9.47f, 21.63f, 9.24f, 21.75f, 9f, 21.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 21.75f)
                curveTo(14.92f, 21.75f, 14.84f, 21.74f, 14.76f, 21.71f)
                curveTo(14.37f, 21.58f, 14.15f, 21.15f, 14.29f, 20.76f)
                curveTo(16.17f, 15.11f, 16.17f, 8.89f, 14.29f, 3.23f)
                curveTo(14.16f, 2.84f, 14.37f, 2.41f, 14.76f, 2.28f)
                curveTo(15.16f, 2.15f, 15.58f, 2.36f, 15.71f, 2.75f)
                curveTo(17.7f, 8.71f, 17.7f, 15.27f, 15.71f, 21.22f)
                curveTo(15.61f, 21.55f, 15.31f, 21.75f, 15f, 21.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 17.2f)
                curveTo(9.21f, 17.2f, 6.43f, 16.81f, 3.75f, 16.02f)
                curveTo(3.74f, 16.42f, 3.41f, 16.75f, 3f, 16.75f)
                curveTo(2.59f, 16.75f, 2.25f, 16.41f, 2.25f, 16f)
                verticalLineTo(15f)
                curveTo(2.25f, 14.76f, 2.37f, 14.53f, 2.56f, 14.39f)
                curveTo(2.76f, 14.25f, 3.01f, 14.21f, 3.24f, 14.29f)
                curveTo(8.89f, 16.17f, 15.12f, 16.17f, 20.77f, 14.29f)
                curveTo(21f, 14.21f, 21.25f, 14.25f, 21.45f, 14.39f)
                curveTo(21.65f, 14.53f, 21.76f, 14.76f, 21.76f, 15f)
                verticalLineTo(16f)
                curveTo(21.76f, 16.41f, 21.42f, 16.75f, 21.01f, 16.75f)
                curveTo(20.6f, 16.75f, 20.27f, 16.43f, 20.26f, 16.02f)
                curveTo(17.57f, 16.81f, 14.79f, 17.2f, 12f, 17.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21f, 9.75f)
                curveTo(20.92f, 9.75f, 20.84f, 9.74f, 20.76f, 9.71f)
                curveTo(15.11f, 7.83f, 8.88f, 7.83f, 3.23f, 9.71f)
                curveTo(2.83f, 9.84f, 2.41f, 9.63f, 2.28f, 9.24f)
                curveTo(2.16f, 8.84f, 2.37f, 8.42f, 2.76f, 8.29f)
                curveTo(8.72f, 6.3f, 15.28f, 6.3f, 21.23f, 8.29f)
                curveTo(21.62f, 8.42f, 21.84f, 8.85f, 21.7f, 9.24f)
                curveTo(21.61f, 9.55f, 21.31f, 9.75f, 21f, 9.75f)
                close()
            }
        }.build()

        return _Global!!
    }

@Suppress("ObjectPropertyName")
private var _Global: ImageVector? = null
