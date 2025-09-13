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

val Iconsax.Outline.Translate: ImageVector
    get() {
        if (_Translate != null) {
            return _Translate!!
        }
        _Translate = ImageVector.Builder(
            name = "Outline.Translate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.789f, 19.42f)
                curveTo(14.679f, 19.42f, 14.559f, 19.39f, 14.459f, 19.34f)
                curveTo(14.089f, 19.15f, 13.939f, 18.7f, 14.119f, 18.33f)
                lineTo(16.259f, 14.06f)
                curveTo(16.389f, 13.81f, 16.649f, 13.65f, 16.929f, 13.65f)
                curveTo(17.209f, 13.65f, 17.469f, 13.81f, 17.599f, 14.07f)
                lineTo(19.739f, 18.34f)
                curveTo(19.929f, 18.71f, 19.779f, 19.16f, 19.399f, 19.35f)
                curveTo(19.029f, 19.54f, 18.579f, 19.39f, 18.389f, 19.01f)
                lineTo(16.929f, 16.08f)
                lineTo(15.469f, 19.01f)
                curveTo(15.329f, 19.27f, 15.059f, 19.42f, 14.789f, 19.42f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.68f, 18.66f)
                horizontalLineTo(15.16f)
                curveTo(14.75f, 18.66f, 14.41f, 18.32f, 14.41f, 17.91f)
                curveTo(14.41f, 17.5f, 14.75f, 17.16f, 15.16f, 17.16f)
                horizontalLineTo(18.68f)
                curveTo(19.09f, 17.16f, 19.43f, 17.5f, 19.43f, 17.91f)
                curveTo(19.43f, 18.32f, 19.1f, 18.66f, 18.68f, 18.66f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.92f, 22.75f)
                curveTo(13.71f, 22.75f, 11.09f, 20.14f, 11.09f, 16.92f)
                curveTo(11.09f, 13.7f, 13.7f, 11.09f, 16.92f, 11.09f)
                curveTo(20.13f, 11.09f, 22.75f, 13.7f, 22.75f, 16.92f)
                curveTo(22.75f, 20.14f, 20.14f, 22.75f, 16.92f, 22.75f)
                close()
                moveTo(16.92f, 12.6f)
                curveTo(14.53f, 12.6f, 12.59f, 14.54f, 12.59f, 16.93f)
                curveTo(12.59f, 19.32f, 14.53f, 21.26f, 16.92f, 21.26f)
                curveTo(19.3f, 21.26f, 21.25f, 19.32f, 21.25f, 16.93f)
                curveTo(21.25f, 14.54f, 19.31f, 12.6f, 16.92f, 12.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.86f, 12.7f)
                curveTo(3.75f, 12.7f, 2.87f, 12.39f, 2.25f, 11.79f)
                curveTo(1.59f, 11.15f, 1.25f, 10.18f, 1.25f, 8.93f)
                verticalLineTo(5.01f)
                curveTo(1.25f, 2.58f, 2.59f, 1.24f, 5.02f, 1.24f)
                horizontalLineTo(8.94f)
                curveTo(10.19f, 1.24f, 11.15f, 1.57f, 11.8f, 2.24f)
                curveTo(12.43f, 2.89f, 12.74f, 3.83f, 12.71f, 5.03f)
                verticalLineTo(8.93f)
                curveTo(12.74f, 10.15f, 12.43f, 11.11f, 11.78f, 11.76f)
                curveTo(11.13f, 12.41f, 10.17f, 12.71f, 8.93f, 12.69f)
                horizontalLineTo(5.03f)
                curveTo(4.96f, 12.7f, 4.91f, 12.7f, 4.86f, 12.7f)
                close()
                moveTo(5.02f, 2.75f)
                curveTo(3.41f, 2.75f, 2.75f, 3.41f, 2.75f, 5.02f)
                verticalLineTo(8.94f)
                curveTo(2.75f, 9.77f, 2.93f, 10.37f, 3.29f, 10.72f)
                curveTo(3.64f, 11.06f, 4.2f, 11.21f, 4.99f, 11.2f)
                horizontalLineTo(8.93f)
                curveTo(9.77f, 11.22f, 10.35f, 11.05f, 10.7f, 10.7f)
                curveTo(11.05f, 10.35f, 11.21f, 9.76f, 11.19f, 8.95f)
                verticalLineTo(5.01f)
                curveTo(11.21f, 4.21f, 11.05f, 3.64f, 10.71f, 3.29f)
                curveTo(10.36f, 2.93f, 9.76f, 2.75f, 8.93f, 2.75f)
                horizontalLineTo(5.02f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.999f, 6.6f)
                horizontalLineTo(4.939f)
                curveTo(4.529f, 6.6f, 4.189f, 6.26f, 4.189f, 5.85f)
                curveTo(4.189f, 5.44f, 4.529f, 5.1f, 4.939f, 5.1f)
                horizontalLineTo(8.999f)
                curveTo(9.409f, 5.1f, 9.749f, 5.44f, 9.749f, 5.85f)
                curveTo(9.749f, 6.26f, 9.419f, 6.6f, 8.999f, 6.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.98f, 6.6f)
                curveTo(6.57f, 6.6f, 6.23f, 6.26f, 6.23f, 5.85f)
                verticalLineTo(5.17f)
                curveTo(6.23f, 4.76f, 6.57f, 4.42f, 6.98f, 4.42f)
                curveTo(7.39f, 4.42f, 7.73f, 4.76f, 7.73f, 5.17f)
                verticalLineTo(5.85f)
                curveTo(7.73f, 6.26f, 7.39f, 6.6f, 6.98f, 6.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.939f, 9.76f)
                curveTo(4.529f, 9.76f, 4.189f, 9.42f, 4.189f, 9.01f)
                curveTo(4.189f, 8.6f, 4.529f, 8.26f, 4.939f, 8.26f)
                curveTo(6.209f, 8.26f, 7.239f, 7.18f, 7.239f, 5.84f)
                curveTo(7.239f, 5.43f, 7.579f, 5.09f, 7.989f, 5.09f)
                curveTo(8.399f, 5.09f, 8.739f, 5.43f, 8.739f, 5.84f)
                curveTo(8.739f, 8f, 7.039f, 9.76f, 4.939f, 9.76f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.01f, 9.76f)
                curveTo(8.08f, 9.76f, 7.19f, 9.29f, 6.56f, 8.46f)
                curveTo(6.31f, 8.13f, 6.38f, 7.66f, 6.71f, 7.41f)
                curveTo(7.04f, 7.16f, 7.51f, 7.23f, 7.76f, 7.56f)
                curveTo(8.1f, 8.02f, 8.55f, 8.27f, 9.01f, 8.27f)
                curveTo(9.42f, 8.27f, 9.76f, 8.61f, 9.76f, 9.02f)
                curveTo(9.76f, 9.43f, 9.42f, 9.76f, 9.01f, 9.76f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9f, 22.75f)
                curveTo(4.73f, 22.75f, 1.25f, 19.27f, 1.25f, 15f)
                curveTo(1.25f, 14.59f, 1.59f, 14.25f, 2f, 14.25f)
                curveTo(2.41f, 14.25f, 2.75f, 14.59f, 2.75f, 15f)
                curveTo(2.75f, 17.96f, 4.81f, 20.44f, 7.58f, 21.09f)
                lineTo(7.31f, 20.64f)
                curveTo(7.1f, 20.28f, 7.21f, 19.82f, 7.57f, 19.61f)
                curveTo(7.92f, 19.4f, 8.39f, 19.51f, 8.6f, 19.87f)
                lineTo(9.65f, 21.62f)
                curveTo(9.79f, 21.85f, 9.79f, 22.14f, 9.66f, 22.37f)
                curveTo(9.52f, 22.6f, 9.27f, 22.75f, 9f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 9.75f)
                curveTo(21.59f, 9.75f, 21.25f, 9.41f, 21.25f, 9f)
                curveTo(21.25f, 6.04f, 19.19f, 3.56f, 16.42f, 2.91f)
                lineTo(16.69f, 3.36f)
                curveTo(16.9f, 3.72f, 16.79f, 4.18f, 16.43f, 4.39f)
                curveTo(16.08f, 4.6f, 15.61f, 4.49f, 15.4f, 4.13f)
                lineTo(14.35f, 2.38f)
                curveTo(14.21f, 2.15f, 14.21f, 1.86f, 14.34f, 1.63f)
                curveTo(14.47f, 1.39f, 14.72f, 1.25f, 14.99f, 1.25f)
                curveTo(19.26f, 1.25f, 22.74f, 4.73f, 22.74f, 9f)
                curveTo(22.75f, 9.41f, 22.41f, 9.75f, 22f, 9.75f)
                close()
            }
        }.build()

        return _Translate!!
    }

@Suppress("ObjectPropertyName")
private var _Translate: ImageVector? = null
