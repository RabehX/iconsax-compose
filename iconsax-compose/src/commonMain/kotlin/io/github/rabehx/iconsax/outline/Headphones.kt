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

val Iconsax.Outline.Headphones: ImageVector
    get() {
        if (_Headphones != null) {
            return _Headphones!!
        }
        _Headphones = ImageVector.Builder(
            name = "Outline.Headphones",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.5f, 12.75f)
                curveTo(8.09f, 12.75f, 7.75f, 12.41f, 7.75f, 12f)
                verticalLineTo(7.22f)
                curveTo(7.75f, 6.81f, 8.09f, 6.47f, 8.5f, 6.47f)
                curveTo(8.91f, 6.47f, 9.25f, 6.81f, 9.25f, 7.22f)
                verticalLineTo(12f)
                curveTo(9.25f, 12.41f, 8.91f, 12.75f, 8.5f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.5f, 22.75f)
                curveTo(8.09f, 22.75f, 7.75f, 22.41f, 7.75f, 22f)
                verticalLineTo(19f)
                curveTo(7.75f, 18.59f, 8.09f, 18.25f, 8.5f, 18.25f)
                curveTo(8.91f, 18.25f, 9.25f, 18.59f, 9.25f, 19f)
                verticalLineTo(22f)
                curveTo(9.25f, 22.41f, 8.91f, 22.75f, 8.5f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.5f, 22.75f)
                curveTo(15.09f, 22.75f, 14.75f, 22.41f, 14.75f, 22f)
                verticalLineTo(7.22f)
                curveTo(14.75f, 6.81f, 15.09f, 6.47f, 15.5f, 6.47f)
                curveTo(15.91f, 6.47f, 16.25f, 6.81f, 16.25f, 7.22f)
                verticalLineTo(22f)
                curveTo(16.25f, 22.41f, 15.91f, 22.75f, 15.5f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.299f, 7.85f)
                horizontalLineTo(6.049f)
                curveTo(5.759f, 7.85f, 5.509f, 7.69f, 5.379f, 7.43f)
                curveTo(5.249f, 7.17f, 5.279f, 6.87f, 5.449f, 6.64f)
                curveTo(5.639f, 6.39f, 5.749f, 6.07f, 5.749f, 5.74f)
                verticalLineTo(4.84f)
                curveTo(5.749f, 4.52f, 5.639f, 4.2f, 5.449f, 3.94f)
                curveTo(5.279f, 3.71f, 5.249f, 3.41f, 5.379f, 3.15f)
                curveTo(5.509f, 2.9f, 5.769f, 2.73f, 6.049f, 2.73f)
                horizontalLineTo(8.299f)
                curveTo(9.709f, 2.73f, 10.849f, 3.87f, 10.849f, 5.28f)
                curveTo(10.849f, 5.97f, 10.579f, 6.61f, 10.089f, 7.09f)
                curveTo(9.629f, 7.58f, 8.989f, 7.85f, 8.299f, 7.85f)
                close()
                moveTo(7.189f, 6.35f)
                horizontalLineTo(8.299f)
                curveTo(8.579f, 6.35f, 8.839f, 6.24f, 9.029f, 6.05f)
                curveTo(9.239f, 5.85f, 9.349f, 5.59f, 9.349f, 5.3f)
                curveTo(9.349f, 4.72f, 8.879f, 4.25f, 8.299f, 4.25f)
                horizontalLineTo(7.189f)
                curveTo(7.229f, 4.45f, 7.249f, 4.65f, 7.249f, 4.85f)
                verticalLineTo(5.75f)
                curveTo(7.249f, 5.95f, 7.229f, 6.15f, 7.189f, 6.35f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.25f, 8.75f)
                curveTo(3.59f, 8.75f, 2.71f, 8.54f, 1.79f, 7.72f)
                curveTo(1.48f, 7.44f, 1.26f, 6.94f, 1.26f, 6.5f)
                verticalLineTo(4.16f)
                curveTo(1.26f, 3.77f, 1.44f, 3.31f, 1.7f, 3.04f)
                curveTo(2.63f, 2.07f, 3.59f, 1.86f, 4.23f, 1.85f)
                curveTo(4.24f, 1.85f, 4.25f, 1.85f, 4.26f, 1.85f)
                curveTo(5.05f, 1.85f, 5.83f, 2.17f, 6.38f, 2.73f)
                curveTo(6.48f, 2.83f, 6.58f, 2.95f, 6.67f, 3.07f)
                curveTo(7.04f, 3.56f, 7.25f, 4.2f, 7.25f, 4.85f)
                verticalLineTo(5.75f)
                curveTo(7.25f, 6.4f, 7.04f, 7.04f, 6.65f, 7.55f)
                curveTo(6.15f, 8.22f, 5.38f, 8.65f, 4.55f, 8.73f)
                curveTo(4.46f, 8.74f, 4.35f, 8.75f, 4.25f, 8.75f)
                close()
                moveTo(4.25f, 3.35f)
                curveTo(4.24f, 3.35f, 4.24f, 3.35f, 4.23f, 3.35f)
                curveTo(3.72f, 3.36f, 3.22f, 3.61f, 2.77f, 4.08f)
                curveTo(2.77f, 4.08f, 2.75f, 4.15f, 2.75f, 4.18f)
                verticalLineTo(6.51f)
                curveTo(2.75f, 6.53f, 2.78f, 6.6f, 2.8f, 6.63f)
                curveTo(3.31f, 7.08f, 3.87f, 7.31f, 4.4f, 7.25f)
                curveTo(4.82f, 7.21f, 5.19f, 7f, 5.45f, 6.66f)
                curveTo(5.64f, 6.41f, 5.75f, 6.09f, 5.75f, 5.76f)
                verticalLineTo(4.86f)
                curveTo(5.75f, 4.54f, 5.64f, 4.22f, 5.45f, 3.96f)
                curveTo(5.4f, 3.88f, 5.35f, 3.84f, 5.31f, 3.79f)
                curveTo(5.03f, 3.51f, 4.65f, 3.35f, 4.25f, 3.35f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.95f, 7.85f)
                horizontalLineTo(15.7f)
                curveTo(15.01f, 7.85f, 14.37f, 7.58f, 13.89f, 7.09f)
                curveTo(13.42f, 6.63f, 13.15f, 5.99f, 13.15f, 5.3f)
                curveTo(13.15f, 3.89f, 14.29f, 2.75f, 15.7f, 2.75f)
                horizontalLineTo(17.95f)
                curveTo(18.23f, 2.75f, 18.49f, 2.91f, 18.62f, 3.17f)
                curveTo(18.75f, 3.42f, 18.72f, 3.73f, 18.55f, 3.96f)
                curveTo(18.36f, 4.21f, 18.25f, 4.53f, 18.25f, 4.86f)
                verticalLineTo(5.76f)
                curveTo(18.25f, 6.09f, 18.36f, 6.4f, 18.55f, 6.66f)
                curveTo(18.72f, 6.89f, 18.75f, 7.19f, 18.62f, 7.45f)
                curveTo(18.5f, 7.69f, 18.24f, 7.85f, 17.95f, 7.85f)
                close()
                moveTo(15.7f, 4.25f)
                curveTo(15.12f, 4.25f, 14.65f, 4.72f, 14.65f, 5.3f)
                curveTo(14.65f, 5.58f, 14.76f, 5.84f, 14.95f, 6.03f)
                curveTo(15.15f, 6.24f, 15.41f, 6.35f, 15.7f, 6.35f)
                horizontalLineTo(16.81f)
                curveTo(16.77f, 6.15f, 16.75f, 5.95f, 16.75f, 5.75f)
                verticalLineTo(4.85f)
                curveTo(16.75f, 4.65f, 16.77f, 4.45f, 16.81f, 4.25f)
                horizontalLineTo(15.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.75f, 8.75f)
                curveTo(19.64f, 8.75f, 19.54f, 8.74f, 19.44f, 8.74f)
                curveTo(18.61f, 8.66f, 17.85f, 8.23f, 17.34f, 7.56f)
                curveTo(16.95f, 7.05f, 16.74f, 6.41f, 16.74f, 5.76f)
                verticalLineTo(4.86f)
                curveTo(16.74f, 4.21f, 16.95f, 3.57f, 17.34f, 3.06f)
                curveTo(17.41f, 2.96f, 17.51f, 2.84f, 17.61f, 2.74f)
                curveTo(18.17f, 2.18f, 18.94f, 1.86f, 19.73f, 1.86f)
                curveTo(19.74f, 1.86f, 19.75f, 1.86f, 19.76f, 1.86f)
                curveTo(20.4f, 1.87f, 21.36f, 2.08f, 22.29f, 3.05f)
                curveTo(22.55f, 3.32f, 22.73f, 3.78f, 22.73f, 4.17f)
                verticalLineTo(6.51f)
                curveTo(22.73f, 6.95f, 22.51f, 7.45f, 22.2f, 7.72f)
                curveTo(21.29f, 8.54f, 20.41f, 8.75f, 19.75f, 8.75f)
                close()
                moveTo(19.75f, 3.35f)
                curveTo(19.35f, 3.35f, 18.96f, 3.51f, 18.69f, 3.79f)
                curveTo(18.65f, 3.83f, 18.61f, 3.88f, 18.57f, 3.93f)
                curveTo(18.36f, 4.21f, 18.25f, 4.53f, 18.25f, 4.85f)
                verticalLineTo(5.75f)
                curveTo(18.25f, 6.08f, 18.36f, 6.39f, 18.55f, 6.65f)
                curveTo(18.81f, 6.99f, 19.18f, 7.2f, 19.6f, 7.25f)
                curveTo(20.13f, 7.31f, 20.69f, 7.08f, 21.23f, 6.61f)
                curveTo(21.23f, 6.61f, 21.25f, 6.54f, 21.26f, 6.51f)
                verticalLineTo(4.18f)
                curveTo(21.26f, 4.16f, 21.23f, 4.09f, 21.22f, 4.07f)
                curveTo(20.79f, 3.62f, 20.29f, 3.37f, 19.78f, 3.37f)
                curveTo(19.76f, 3.35f, 19.76f, 3.35f, 19.75f, 3.35f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.5f, 19.75f)
                curveTo(7.26f, 19.75f, 6.25f, 18.74f, 6.25f, 17.5f)
                verticalLineTo(13.5f)
                curveTo(6.25f, 12.26f, 7.26f, 11.25f, 8.5f, 11.25f)
                curveTo(9.74f, 11.25f, 10.75f, 12.26f, 10.75f, 13.5f)
                verticalLineTo(17.5f)
                curveTo(10.75f, 18.74f, 9.74f, 19.75f, 8.5f, 19.75f)
                close()
                moveTo(8.5f, 12.75f)
                curveTo(8.09f, 12.75f, 7.75f, 13.09f, 7.75f, 13.5f)
                verticalLineTo(17.5f)
                curveTo(7.75f, 17.91f, 8.09f, 18.25f, 8.5f, 18.25f)
                curveTo(8.91f, 18.25f, 9.25f, 17.91f, 9.25f, 17.5f)
                verticalLineTo(13.5f)
                curveTo(9.25f, 13.09f, 8.91f, 12.75f, 8.5f, 12.75f)
                close()
            }
        }.build()

        return _Headphones!!
    }

@Suppress("ObjectPropertyName")
private var _Headphones: ImageVector? = null
