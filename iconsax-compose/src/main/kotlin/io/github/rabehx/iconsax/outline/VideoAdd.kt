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

val Iconsax.Outline.VideoAdd: ImageVector
    get() {
        if (_VideoAdd != null) {
            return _VideoAdd!!
        }
        _VideoAdd = ImageVector.Builder(
            name = "Outline.VideoAdd",
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
                curveTo(22.75f, 15.25f, 22.75f, 15.5f, 22.73f, 15.74f)
                curveTo(22.7f, 16.06f, 22.48f, 16.32f, 22.17f, 16.4f)
                curveTo(21.86f, 16.48f, 21.54f, 16.36f, 21.36f, 16.09f)
                curveTo(21.33f, 16.06f, 21.27f, 15.99f, 21.23f, 15.94f)
                curveTo(20.51f, 15.17f, 19.53f, 14.75f, 18.5f, 14.75f)
                curveTo(17.48f, 14.75f, 16.52f, 15.15f, 15.81f, 15.88f)
                curveTo(15.13f, 16.58f, 14.75f, 17.51f, 14.75f, 18.5f)
                curveTo(14.75f, 19.17f, 14.94f, 19.84f, 15.29f, 20.43f)
                curveTo(15.47f, 20.73f, 15.69f, 21.01f, 15.94f, 21.23f)
                curveTo(15.98f, 21.26f, 16.01f, 21.29f, 16.03f, 21.31f)
                lineTo(16.11f, 21.38f)
                curveTo(16.34f, 21.57f, 16.45f, 21.9f, 16.36f, 22.19f)
                curveTo(16.27f, 22.48f, 16.03f, 22.7f, 15.73f, 22.73f)
                curveTo(15.51f, 22.75f, 15.25f, 22.75f, 15f, 22.75f)
                close()
                moveTo(9f, 2.75f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(14.03f)
                curveTo(14.02f, 21.23f, 14.01f, 21.22f, 14f, 21.2f)
                curveTo(13.51f, 20.38f, 13.24f, 19.44f, 13.24f, 18.5f)
                curveTo(13.24f, 17.12f, 13.77f, 15.82f, 14.72f, 14.84f)
                curveTo(15.7f, 13.83f, 17.08f, 13.25f, 18.49f, 13.25f)
                curveTo(19.47f, 13.25f, 20.43f, 13.52f, 21.24f, 14.03f)
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
                curveTo(17.32f, 23.75f, 16.17f, 23.35f, 15.27f, 22.61f)
                curveTo(15.24f, 22.59f, 15.21f, 22.57f, 15.19f, 22.55f)
                curveTo(15.12f, 22.49f, 15.07f, 22.45f, 15.03f, 22.41f)
                curveTo(15.01f, 22.4f, 15f, 22.39f, 14.99f, 22.37f)
                curveTo(14.62f, 22.04f, 14.28f, 21.64f, 14.02f, 21.2f)
                curveTo(13.53f, 20.38f, 13.26f, 19.44f, 13.26f, 18.5f)
                curveTo(13.26f, 17.12f, 13.79f, 15.82f, 14.74f, 14.84f)
                curveTo(15.72f, 13.83f, 17.1f, 13.25f, 18.51f, 13.25f)
                curveTo(19.99f, 13.25f, 21.4f, 13.87f, 22.38f, 14.96f)
                curveTo(22.39f, 14.97f, 22.41f, 14.99f, 22.42f, 15.01f)
                curveTo(22.49f, 15.08f, 22.56f, 15.17f, 22.61f, 15.25f)
                curveTo(23.33f, 16.12f, 23.76f, 17.29f, 23.76f, 18.5f)
                curveTo(23.76f, 18.94f, 23.71f, 19.35f, 23.61f, 19.74f)
                curveTo(23.49f, 20.24f, 23.29f, 20.73f, 23.01f, 21.2f)
                curveTo(22.05f, 22.78f, 20.33f, 23.75f, 18.5f, 23.75f)
                close()
                moveTo(16.09f, 21.35f)
                curveTo(16.12f, 21.37f, 16.14f, 21.38f, 16.16f, 21.4f)
                curveTo(16.82f, 21.95f, 17.62f, 22.24f, 18.5f, 22.24f)
                curveTo(19.81f, 22.24f, 21.03f, 21.54f, 21.71f, 20.42f)
                curveTo(21.91f, 20.09f, 22.05f, 19.73f, 22.14f, 19.36f)
                curveTo(22.21f, 19.08f, 22.25f, 18.8f, 22.25f, 18.49f)
                curveTo(22.25f, 17.63f, 21.95f, 16.8f, 21.4f, 16.14f)
                lineTo(21.31f, 16.02f)
                curveTo(21.28f, 15.99f, 21.25f, 15.96f, 21.23f, 15.92f)
                curveTo(20.51f, 15.16f, 19.53f, 14.74f, 18.5f, 14.74f)
                curveTo(17.48f, 14.74f, 16.52f, 15.14f, 15.81f, 15.87f)
                curveTo(15.13f, 16.57f, 14.75f, 17.5f, 14.75f, 18.49f)
                curveTo(14.75f, 19.16f, 14.94f, 19.83f, 15.29f, 20.42f)
                curveTo(15.47f, 20.72f, 15.69f, 21f, 15.94f, 21.22f)
                curveTo(15.98f, 21.25f, 16.01f, 21.28f, 16.03f, 21.3f)
                lineTo(16.09f, 21.35f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.18f, 19.23f)
                horizontalLineTo(16.82f)
                curveTo(16.41f, 19.23f, 16.07f, 18.89f, 16.07f, 18.48f)
                curveTo(16.07f, 18.07f, 16.41f, 17.73f, 16.82f, 17.73f)
                horizontalLineTo(20.18f)
                curveTo(20.59f, 17.73f, 20.93f, 18.07f, 20.93f, 18.48f)
                curveTo(20.93f, 18.89f, 20.6f, 19.23f, 20.18f, 19.23f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.5f, 20.95f)
                curveTo(18.09f, 20.95f, 17.75f, 20.61f, 17.75f, 20.2f)
                verticalLineTo(16.84f)
                curveTo(17.75f, 16.43f, 18.09f, 16.09f, 18.5f, 16.09f)
                curveTo(18.91f, 16.09f, 19.25f, 16.43f, 19.25f, 16.84f)
                verticalLineTo(20.2f)
                curveTo(19.25f, 20.62f, 18.91f, 20.95f, 18.5f, 20.95f)
                close()
            }
        }.build()

        return _VideoAdd!!
    }

@Suppress("ObjectPropertyName")
private var _VideoAdd: ImageVector? = null
