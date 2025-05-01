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

val Iconsax.Outline.VideoTick: ImageVector
    get() {
        if (_VideoTick != null) {
            return _VideoTick!!
        }
        _VideoTick = ImageVector.Builder(
            name = "Outline.VideoTick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9f)
                verticalLineTo(15f)
                curveTo(22.75f, 15.24f, 22.75f, 15.49f, 22.73f, 15.72f)
                curveTo(22.7f, 16.02f, 22.49f, 16.28f, 22.2f, 16.37f)
                curveTo(21.91f, 16.46f, 21.59f, 16.36f, 21.4f, 16.12f)
                curveTo(20.69f, 15.25f, 19.64f, 14.75f, 18.5f, 14.75f)
                curveTo(17.65f, 14.75f, 16.82f, 15.04f, 16.16f, 15.57f)
                curveTo(15.26f, 16.28f, 14.75f, 17.34f, 14.75f, 18.5f)
                curveTo(14.75f, 19.17f, 14.94f, 19.84f, 15.29f, 20.43f)
                curveTo(15.51f, 20.8f, 15.8f, 21.13f, 16.13f, 21.39f)
                curveTo(16.37f, 21.58f, 16.47f, 21.9f, 16.38f, 22.19f)
                curveTo(16.29f, 22.48f, 16.04f, 22.69f, 15.73f, 22.72f)
                curveTo(15.5f, 22.75f, 15.25f, 22.75f, 15f, 22.75f)
                close()
                moveTo(9f, 2.75f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(14.03f)
                curveTo(14.02f, 21.24f, 14.01f, 21.22f, 14f, 21.21f)
                curveTo(13.5f, 20.39f, 13.24f, 19.45f, 13.24f, 18.5f)
                curveTo(13.24f, 16.88f, 13.96f, 15.39f, 15.22f, 14.4f)
                curveTo(16.9f, 13.04f, 19.45f, 12.92f, 21.24f, 14.02f)
                verticalLineTo(9f)
                curveTo(21.24f, 4.39f, 19.6f, 2.75f, 14.99f, 2.75f)
                horizontalLineTo(9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.479f, 7.86f)
                horizontalLineTo(2.52f)
                curveTo(2.11f, 7.86f, 1.77f, 7.52f, 1.77f, 7.11f)
                curveTo(1.77f, 6.7f, 2.11f, 6.36f, 2.52f, 6.36f)
                horizontalLineTo(21.479f)
                curveTo(21.889f, 6.36f, 22.229f, 6.7f, 22.229f, 7.11f)
                curveTo(22.229f, 7.52f, 21.899f, 7.86f, 21.479f, 7.86f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.52f, 7.72f)
                curveTo(8.11f, 7.72f, 7.77f, 7.38f, 7.77f, 6.97f)
                verticalLineTo(2.11f)
                curveTo(7.77f, 1.7f, 8.11f, 1.36f, 8.52f, 1.36f)
                curveTo(8.93f, 1.36f, 9.27f, 1.7f, 9.27f, 2.11f)
                verticalLineTo(6.97f)
                curveTo(9.27f, 7.38f, 8.93f, 7.72f, 8.52f, 7.72f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.481f, 7.27f)
                curveTo(15.071f, 7.27f, 14.731f, 6.93f, 14.731f, 6.52f)
                verticalLineTo(2.11f)
                curveTo(14.731f, 1.7f, 15.071f, 1.36f, 15.481f, 1.36f)
                curveTo(15.891f, 1.36f, 16.23f, 1.7f, 16.23f, 2.11f)
                verticalLineTo(6.52f)
                curveTo(16.23f, 6.94f, 15.901f, 7.27f, 15.481f, 7.27f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.5f, 23.75f)
                curveTo(17.32f, 23.75f, 16.18f, 23.35f, 15.26f, 22.62f)
                curveTo(15.24f, 22.6f, 15.21f, 22.59f, 15.19f, 22.57f)
                curveTo(14.72f, 22.19f, 14.32f, 21.74f, 14.01f, 21.21f)
                curveTo(13.51f, 20.39f, 13.25f, 19.45f, 13.25f, 18.5f)
                curveTo(13.25f, 16.88f, 13.97f, 15.39f, 15.23f, 14.4f)
                curveTo(16.15f, 13.66f, 17.31f, 13.25f, 18.5f, 13.25f)
                curveTo(20.09f, 13.25f, 21.57f, 13.95f, 22.56f, 15.18f)
                curveTo(23.32f, 16.1f, 23.75f, 17.28f, 23.75f, 18.5f)
                curveTo(23.75f, 19.45f, 23.49f, 20.38f, 22.99f, 21.21f)
                curveTo(22.7f, 21.69f, 22.35f, 22.1f, 21.95f, 22.45f)
                curveTo(21f, 23.29f, 19.78f, 23.75f, 18.5f, 23.75f)
                close()
                moveTo(16.07f, 21.35f)
                curveTo(16.1f, 21.37f, 16.12f, 21.39f, 16.15f, 21.41f)
                curveTo(16.81f, 21.96f, 17.64f, 22.26f, 18.5f, 22.26f)
                curveTo(19.42f, 22.26f, 20.27f, 21.94f, 20.96f, 21.33f)
                curveTo(21.25f, 21.08f, 21.5f, 20.78f, 21.71f, 20.45f)
                curveTo(22.06f, 19.86f, 22.25f, 19.19f, 22.25f, 18.52f)
                curveTo(22.25f, 17.65f, 21.95f, 16.81f, 21.4f, 16.15f)
                curveTo(20.69f, 15.27f, 19.63f, 14.77f, 18.5f, 14.77f)
                curveTo(17.65f, 14.77f, 16.82f, 15.06f, 16.16f, 15.59f)
                curveTo(15.26f, 16.3f, 14.75f, 17.36f, 14.75f, 18.52f)
                curveTo(14.75f, 19.19f, 14.94f, 19.86f, 15.29f, 20.45f)
                curveTo(15.5f, 20.78f, 15.76f, 21.09f, 16.07f, 21.35f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.85f, 20.36f)
                curveTo(17.66f, 20.36f, 17.47f, 20.29f, 17.32f, 20.14f)
                lineTo(16.21f, 19.03f)
                curveTo(15.92f, 18.74f, 15.92f, 18.26f, 16.21f, 17.97f)
                curveTo(16.5f, 17.68f, 16.98f, 17.68f, 17.27f, 17.97f)
                lineTo(17.87f, 18.57f)
                lineTo(19.74f, 16.84f)
                curveTo(20.04f, 16.56f, 20.52f, 16.58f, 20.8f, 16.88f)
                curveTo(21.08f, 17.18f, 21.06f, 17.66f, 20.76f, 17.94f)
                lineTo(18.36f, 20.16f)
                curveTo(18.22f, 20.29f, 18.04f, 20.36f, 17.85f, 20.36f)
                close()
            }
        }.build()

        return _VideoTick!!
    }

@Suppress("ObjectPropertyName")
private var _VideoTick: ImageVector? = null
