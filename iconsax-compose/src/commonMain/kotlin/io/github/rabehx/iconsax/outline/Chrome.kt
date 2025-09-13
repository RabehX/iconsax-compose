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

val Iconsax.Outline.Chrome: ImageVector
    get() {
        if (_Chrome != null) {
            return _Chrome!!
        }
        _Chrome = ImageVector.Builder(
            name = "Outline.Chrome",
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
                moveTo(12f, 16.75f)
                curveTo(9.38f, 16.75f, 7.25f, 14.62f, 7.25f, 12f)
                curveTo(7.25f, 9.38f, 9.38f, 7.25f, 12f, 7.25f)
                curveTo(14.62f, 7.25f, 16.75f, 9.38f, 16.75f, 12f)
                curveTo(16.75f, 14.62f, 14.62f, 16.75f, 12f, 16.75f)
                close()
                moveTo(12f, 8.75f)
                curveTo(10.21f, 8.75f, 8.75f, 10.21f, 8.75f, 12f)
                curveTo(8.75f, 13.79f, 10.21f, 15.25f, 12f, 15.25f)
                curveTo(13.79f, 15.25f, 15.25f, 13.79f, 15.25f, 12f)
                curveTo(15.25f, 10.21f, 13.79f, 8.75f, 12f, 8.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.17f, 8.75f)
                curveTo(21.12f, 8.75f, 21.06f, 8.74f, 21.01f, 8.73f)
                curveTo(18.07f, 8.09f, 15.1f, 8.09f, 12.16f, 8.73f)
                curveTo(11.75f, 8.82f, 11.36f, 8.56f, 11.27f, 8.16f)
                curveTo(11.18f, 7.75f, 11.44f, 7.36f, 11.84f, 7.27f)
                curveTo(14.99f, 6.58f, 18.18f, 6.58f, 21.33f, 7.27f)
                curveTo(21.73f, 7.36f, 21.99f, 7.76f, 21.9f, 8.16f)
                curveTo(21.83f, 8.51f, 21.52f, 8.75f, 21.17f, 8.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.54f, 14.75f)
                curveTo(8.33f, 14.75f, 8.12f, 14.66f, 7.97f, 14.49f)
                curveTo(5.89f, 12.1f, 4.31f, 9.37f, 3.26f, 6.37f)
                lineTo(3.95f, 6.06f)
                lineTo(4.66f, 5.82f)
                lineTo(4.68f, 5.88f)
                curveTo(5.66f, 8.69f, 7.15f, 11.26f, 9.11f, 13.51f)
                curveTo(9.38f, 13.82f, 9.35f, 14.3f, 9.04f, 14.57f)
                curveTo(8.89f, 14.69f, 8.71f, 14.75f, 8.54f, 14.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.88f, 22.69f)
                curveTo(10.7f, 22.69f, 10.52f, 22.63f, 10.38f, 22.5f)
                curveTo(10.07f, 22.22f, 10.05f, 21.75f, 10.33f, 21.44f)
                curveTo(12.33f, 19.24f, 13.81f, 16.69f, 14.73f, 13.86f)
                curveTo(14.86f, 13.47f, 15.3f, 13.21f, 15.69f, 13.34f)
                curveTo(16.08f, 13.47f, 16.31f, 13.85f, 16.19f, 14.24f)
                curveTo(15.18f, 17.36f, 13.59f, 20.1f, 11.45f, 22.46f)
                curveTo(11.29f, 22.61f, 11.08f, 22.69f, 10.88f, 22.69f)
                close()
            }
        }.build()

        return _Chrome!!
    }

@Suppress("ObjectPropertyName")
private var _Chrome: ImageVector? = null
