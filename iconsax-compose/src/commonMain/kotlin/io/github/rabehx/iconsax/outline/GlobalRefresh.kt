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

val Iconsax.Outline.GlobalRefresh: ImageVector
    get() {
        if (_GlobalRefresh != null) {
            return _GlobalRefresh!!
        }
        _GlobalRefresh = ImageVector.Builder(
            name = "Outline.GlobalRefresh",
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
                curveTo(22.75f, 12.41f, 22.41f, 12.75f, 22f, 12.75f)
                curveTo(21.59f, 12.75f, 21.25f, 12.41f, 21.25f, 12f)
                curveTo(21.25f, 6.9f, 17.1f, 2.75f, 12f, 2.75f)
                curveTo(6.9f, 2.75f, 2.75f, 6.9f, 2.75f, 12f)
                curveTo(2.75f, 17.1f, 6.9f, 21.25f, 12f, 21.25f)
                curveTo(12.41f, 21.25f, 12.75f, 21.59f, 12.75f, 22f)
                curveTo(12.75f, 22.41f, 12.41f, 22.75f, 12f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9f, 21.75f)
                horizontalLineTo(8f)
                curveTo(7.59f, 21.75f, 7.25f, 21.41f, 7.25f, 21f)
                curveTo(7.25f, 20.59f, 7.57f, 20.26f, 7.98f, 20.25f)
                curveTo(6.41f, 14.89f, 6.41f, 9.11f, 7.98f, 3.75f)
                curveTo(7.58f, 3.74f, 7.25f, 3.41f, 7.25f, 3f)
                curveTo(7.25f, 2.59f, 7.59f, 2.25f, 8f, 2.25f)
                horizontalLineTo(9f)
                curveTo(9.24f, 2.25f, 9.47f, 2.37f, 9.61f, 2.56f)
                curveTo(9.75f, 2.76f, 9.79f, 3.01f, 9.71f, 3.24f)
                curveTo(7.83f, 8.89f, 7.83f, 15.12f, 9.71f, 20.77f)
                curveTo(9.79f, 21f, 9.75f, 21.25f, 9.61f, 21.45f)
                curveTo(9.47f, 21.65f, 9.24f, 21.75f, 9f, 21.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.46f, 12.75f)
                curveTo(16.05f, 12.75f, 15.71f, 12.41f, 15.71f, 12f)
                curveTo(15.71f, 9.02f, 15.23f, 6.07f, 14.29f, 3.24f)
                curveTo(14.16f, 2.85f, 14.37f, 2.42f, 14.76f, 2.29f)
                curveTo(15.15f, 2.16f, 15.58f, 2.37f, 15.71f, 2.76f)
                curveTo(16.7f, 5.74f, 17.21f, 8.85f, 17.21f, 12f)
                curveTo(17.21f, 12.41f, 16.87f, 12.75f, 16.46f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 17.21f)
                curveTo(9.2f, 17.21f, 6.43f, 16.81f, 3.75f, 16.02f)
                curveTo(3.74f, 16.42f, 3.41f, 16.75f, 3f, 16.75f)
                curveTo(2.59f, 16.75f, 2.25f, 16.41f, 2.25f, 16f)
                verticalLineTo(15f)
                curveTo(2.25f, 14.76f, 2.37f, 14.53f, 2.56f, 14.39f)
                curveTo(2.75f, 14.25f, 3.01f, 14.21f, 3.24f, 14.29f)
                curveTo(6.07f, 15.23f, 9.02f, 15.71f, 12f, 15.71f)
                curveTo(12.41f, 15.71f, 12.75f, 16.05f, 12.75f, 16.46f)
                curveTo(12.75f, 16.87f, 12.41f, 17.21f, 12f, 17.21f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.001f, 9.75f)
                curveTo(20.921f, 9.75f, 20.841f, 9.74f, 20.761f, 9.71f)
                curveTo(15.111f, 7.83f, 8.881f, 7.83f, 3.231f, 9.71f)
                curveTo(2.841f, 9.84f, 2.411f, 9.63f, 2.281f, 9.24f)
                curveTo(2.151f, 8.85f, 2.361f, 8.42f, 2.751f, 8.29f)
                curveTo(8.711f, 6.3f, 15.271f, 6.3f, 21.221f, 8.29f)
                curveTo(21.611f, 8.42f, 21.821f, 8.85f, 21.691f, 9.24f)
                curveTo(21.611f, 9.55f, 21.311f, 9.75f, 21.001f, 9.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.26f, 22.75f)
                curveTo(15.78f, 22.75f, 13.769f, 20.73f, 13.769f, 18.26f)
                curveTo(13.769f, 15.79f, 15.79f, 13.76f, 18.26f, 13.76f)
                curveTo(18.76f, 13.76f, 19.26f, 13.83f, 19.73f, 13.98f)
                curveTo(20.13f, 14.1f, 20.35f, 14.52f, 20.23f, 14.92f)
                curveTo(20.11f, 15.32f, 19.69f, 15.54f, 19.29f, 15.42f)
                curveTo(18.96f, 15.32f, 18.61f, 15.27f, 18.26f, 15.27f)
                curveTo(16.61f, 15.27f, 15.269f, 16.61f, 15.269f, 18.27f)
                curveTo(15.269f, 19.93f, 16.61f, 21.26f, 18.26f, 21.26f)
                curveTo(19.91f, 21.26f, 21.25f, 19.92f, 21.25f, 18.27f)
                curveTo(21.25f, 17.67f, 21.08f, 17.1f, 20.75f, 16.61f)
                curveTo(20.52f, 16.27f, 20.61f, 15.8f, 20.959f, 15.57f)
                curveTo(21.299f, 15.34f, 21.77f, 15.43f, 22f, 15.78f)
                curveTo(22.5f, 16.52f, 22.76f, 17.39f, 22.76f, 18.28f)
                curveTo(22.75f, 20.73f, 20.73f, 22.75f, 18.26f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.039f, 15.55f)
                curveTo(19.829f, 15.55f, 19.619f, 15.46f, 19.469f, 15.29f)
                lineTo(18.219f, 13.86f)
                curveTo(17.949f, 13.55f, 17.979f, 13.07f, 18.289f, 12.8f)
                curveTo(18.599f, 12.53f, 19.069f, 12.56f, 19.349f, 12.87f)
                lineTo(20.599f, 14.3f)
                curveTo(20.869f, 14.61f, 20.839f, 15.09f, 20.529f, 15.36f)
                curveTo(20.389f, 15.49f, 20.219f, 15.55f, 20.039f, 15.55f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.58f, 16.61f)
                curveTo(18.351f, 16.61f, 18.121f, 16.5f, 17.971f, 16.3f)
                curveTo(17.73f, 15.97f, 17.801f, 15.5f, 18.131f, 15.25f)
                lineTo(19.59f, 14.19f)
                curveTo(19.92f, 13.94f, 20.39f, 14.02f, 20.64f, 14.35f)
                curveTo(20.881f, 14.68f, 20.81f, 15.15f, 20.48f, 15.4f)
                lineTo(19.021f, 16.46f)
                curveTo(18.89f, 16.56f, 18.74f, 16.61f, 18.58f, 16.61f)
                close()
            }
        }.build()

        return _GlobalRefresh!!
    }

@Suppress("ObjectPropertyName")
private var _GlobalRefresh: ImageVector? = null
