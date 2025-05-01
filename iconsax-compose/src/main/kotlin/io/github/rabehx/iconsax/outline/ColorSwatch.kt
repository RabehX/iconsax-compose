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

val Iconsax.Outline.ColorSwatch: ImageVector
    get() {
        if (_ColorSwatch != null) {
            return _ColorSwatch!!
        }
        _ColorSwatch = ImageVector.Builder(
            name = "Outline.ColorSwatch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6f, 22.75f)
                curveTo(5.7f, 22.75f, 5.38f, 22.72f, 5.06f, 22.66f)
                curveTo(4.89f, 22.62f, 4.74f, 22.58f, 4.59f, 22.54f)
                curveTo(4.42f, 22.49f, 4.26f, 22.43f, 4.11f, 22.37f)
                curveTo(4.07f, 22.36f, 4.04f, 22.34f, 4.01f, 22.33f)
                curveTo(3.66f, 22.15f, 3.36f, 21.97f, 3.09f, 21.77f)
                curveTo(3.07f, 21.76f, 3.06f, 21.74f, 3.04f, 21.73f)
                curveTo(2.89f, 21.61f, 2.75f, 21.49f, 2.62f, 21.35f)
                curveTo(2.48f, 21.2f, 2.38f, 21.08f, 2.27f, 20.96f)
                curveTo(2.04f, 20.66f, 1.85f, 20.36f, 1.68f, 20.01f)
                curveTo(1.66f, 19.98f, 1.65f, 19.94f, 1.64f, 19.9f)
                curveTo(1.58f, 19.76f, 1.53f, 19.62f, 1.49f, 19.47f)
                curveTo(1.43f, 19.26f, 1.39f, 19.12f, 1.36f, 18.97f)
                curveTo(1.29f, 18.62f, 1.26f, 18.31f, 1.26f, 18.01f)
                verticalLineTo(4.51f)
                curveTo(1.26f, 2.6f, 2.6f, 1.26f, 4.51f, 1.26f)
                horizontalLineTo(7.51f)
                curveTo(9.42f, 1.26f, 10.76f, 2.6f, 10.76f, 4.51f)
                verticalLineTo(18f)
                curveTo(10.76f, 19.24f, 10.28f, 20.42f, 9.41f, 21.31f)
                curveTo(9.25f, 21.47f, 9.13f, 21.58f, 9.02f, 21.67f)
                curveTo(8.7f, 21.95f, 8.29f, 22.2f, 7.85f, 22.38f)
                curveTo(7.75f, 22.42f, 7.63f, 22.47f, 7.5f, 22.52f)
                curveTo(7.01f, 22.67f, 6.5f, 22.75f, 6f, 22.75f)
                close()
                moveTo(4.74f, 21f)
                curveTo(4.84f, 21.04f, 4.94f, 21.07f, 5.04f, 21.1f)
                curveTo(5.15f, 21.13f, 5.26f, 21.16f, 5.37f, 21.19f)
                curveTo(5.92f, 21.29f, 6.51f, 21.26f, 6.98f, 21.1f)
                curveTo(7.05f, 21.07f, 7.15f, 21.04f, 7.24f, 21f)
                curveTo(7.56f, 20.87f, 7.82f, 20.71f, 8.05f, 20.52f)
                curveTo(8.15f, 20.44f, 8.22f, 20.37f, 8.29f, 20.31f)
                curveTo(8.92f, 19.66f, 9.25f, 18.86f, 9.25f, 18.01f)
                verticalLineTo(4.51f)
                curveTo(9.25f, 3.43f, 8.58f, 2.76f, 7.5f, 2.76f)
                horizontalLineTo(4.5f)
                curveTo(3.42f, 2.76f, 2.75f, 3.43f, 2.75f, 4.51f)
                verticalLineTo(18f)
                curveTo(2.75f, 18.21f, 2.77f, 18.43f, 2.82f, 18.66f)
                curveTo(2.84f, 18.75f, 2.87f, 18.86f, 2.9f, 18.98f)
                curveTo(2.94f, 19.09f, 2.97f, 19.18f, 3.01f, 19.28f)
                curveTo(3.03f, 19.31f, 3.04f, 19.34f, 3.05f, 19.36f)
                curveTo(3.06f, 19.38f, 3.07f, 19.41f, 3.08f, 19.43f)
                curveTo(3.2f, 19.65f, 3.32f, 19.84f, 3.45f, 20.01f)
                curveTo(3.52f, 20.09f, 3.61f, 20.19f, 3.7f, 20.29f)
                curveTo(3.81f, 20.41f, 3.9f, 20.48f, 4f, 20.56f)
                curveTo(4.01f, 20.57f, 4.03f, 20.58f, 4.04f, 20.59f)
                curveTo(4.2f, 20.71f, 4.38f, 20.82f, 4.59f, 20.93f)
                curveTo(4.61f, 20.94f, 4.63f, 20.94f, 4.65f, 20.95f)
                curveTo(4.67f, 20.96f, 4.7f, 20.98f, 4.74f, 21f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.5f, 22.75f)
                horizontalLineTo(6f)
                curveTo(5.59f, 22.75f, 5.25f, 22.41f, 5.25f, 22f)
                curveTo(5.25f, 21.59f, 5.59f, 21.25f, 6f, 21.25f)
                curveTo(6.35f, 21.25f, 6.69f, 21.2f, 6.98f, 21.1f)
                curveTo(7.05f, 21.07f, 7.15f, 21.04f, 7.24f, 21f)
                curveTo(7.56f, 20.87f, 7.82f, 20.71f, 8.05f, 20.52f)
                curveTo(8.15f, 20.44f, 8.22f, 20.37f, 8.29f, 20.31f)
                lineTo(15.13f, 13.48f)
                curveTo(15.27f, 13.34f, 15.46f, 13.26f, 15.66f, 13.26f)
                horizontalLineTo(19.5f)
                curveTo(21.41f, 13.26f, 22.75f, 14.6f, 22.75f, 16.51f)
                verticalLineTo(19.51f)
                curveTo(22.75f, 21.41f, 21.41f, 22.75f, 19.5f, 22.75f)
                close()
                moveTo(9.46f, 21.25f)
                horizontalLineTo(19.5f)
                curveTo(20.58f, 21.25f, 21.25f, 20.58f, 21.25f, 19.5f)
                verticalLineTo(16.5f)
                curveTo(21.25f, 15.42f, 20.58f, 14.75f, 19.5f, 14.75f)
                horizontalLineTo(15.97f)
                lineTo(9.46f, 21.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.81f, 22.57f)
                curveTo(4.74f, 22.57f, 4.67f, 22.56f, 4.6f, 22.54f)
                curveTo(3.86f, 22.32f, 3.18f, 21.91f, 2.64f, 21.36f)
                curveTo(2.1f, 20.83f, 1.69f, 20.15f, 1.47f, 19.41f)
                curveTo(1.35f, 19.01f, 1.57f, 18.6f, 1.97f, 18.48f)
                curveTo(2.37f, 18.36f, 2.78f, 18.58f, 2.91f, 18.97f)
                curveTo(3.23f, 19.99f, 4.03f, 20.79f, 5.05f, 21.11f)
                curveTo(5.44f, 21.23f, 5.66f, 21.65f, 5.54f, 22.05f)
                curveTo(5.43f, 22.36f, 5.13f, 22.57f, 4.81f, 22.57f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.86f, 21.54f)
                curveTo(8.67f, 21.54f, 8.48f, 21.47f, 8.33f, 21.32f)
                curveTo(8.04f, 21.03f, 8.03f, 20.56f, 8.32f, 20.26f)
                curveTo(8.92f, 19.65f, 9.25f, 18.84f, 9.25f, 17.99f)
                verticalLineTo(8.33f)
                curveTo(9.25f, 8.13f, 9.33f, 7.94f, 9.47f, 7.8f)
                lineTo(12.18f, 5.09f)
                curveTo(13.49f, 3.78f, 15.47f, 3.78f, 16.78f, 5.09f)
                lineTo(18.9f, 7.21f)
                curveTo(20.25f, 8.56f, 20.25f, 10.46f, 18.9f, 11.81f)
                lineTo(9.39f, 21.31f)
                curveTo(9.24f, 21.47f, 9.05f, 21.54f, 8.86f, 21.54f)
                close()
                moveTo(10.75f, 8.65f)
                verticalLineTo(17.84f)
                lineTo(17.84f, 10.76f)
                curveTo(18.6f, 10f, 18.6f, 9.05f, 17.84f, 8.28f)
                lineTo(15.72f, 6.16f)
                curveTo(14.97f, 5.41f, 13.99f, 5.41f, 13.24f, 6.16f)
                lineTo(10.75f, 8.65f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6f, 19.75f)
                curveTo(5.04f, 19.75f, 4.25f, 18.96f, 4.25f, 18f)
                curveTo(4.25f, 17.04f, 5.04f, 16.25f, 6f, 16.25f)
                curveTo(6.96f, 16.25f, 7.75f, 17.04f, 7.75f, 18f)
                curveTo(7.75f, 18.96f, 6.96f, 19.75f, 6f, 19.75f)
                close()
                moveTo(6f, 17.75f)
                curveTo(5.86f, 17.75f, 5.75f, 17.86f, 5.75f, 18f)
                curveTo(5.75f, 18.28f, 6.25f, 18.28f, 6.25f, 18f)
                curveTo(6.25f, 17.86f, 6.14f, 17.75f, 6f, 17.75f)
                close()
            }
        }.build()

        return _ColorSwatch!!
    }

@Suppress("ObjectPropertyName")
private var _ColorSwatch: ImageVector? = null
