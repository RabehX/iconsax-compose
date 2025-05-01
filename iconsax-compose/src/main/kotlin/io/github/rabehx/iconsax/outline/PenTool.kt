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

val Iconsax.Outline.PenTool: ImageVector
    get() {
        if (_PenTool != null) {
            return _PenTool!!
        }
        _PenTool = ImageVector.Builder(
            name = "Outline.PenTool",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.27f, 23.25f)
                horizontalLineTo(10.75f)
                curveTo(10.05f, 23.25f, 9.42f, 22.95f, 9f, 22.44f)
                curveTo(8.63f, 21.98f, 8.49f, 21.39f, 8.62f, 20.83f)
                lineTo(9.03f, 19.02f)
                curveTo(9.11f, 18.68f, 9.41f, 18.44f, 9.76f, 18.44f)
                horizontalLineTo(14.26f)
                curveTo(14.61f, 18.44f, 14.91f, 18.68f, 14.99f, 19.02f)
                lineTo(15.4f, 20.83f)
                curveTo(15.53f, 21.43f, 15.41f, 22.01f, 15.04f, 22.47f)
                curveTo(14.63f, 22.96f, 13.99f, 23.25f, 13.27f, 23.25f)
                close()
                moveTo(10.36f, 19.92f)
                lineTo(10.08f, 21.15f)
                curveTo(10.05f, 21.3f, 10.11f, 21.42f, 10.17f, 21.49f)
                curveTo(10.3f, 21.65f, 10.51f, 21.74f, 10.75f, 21.74f)
                horizontalLineTo(13.27f)
                curveTo(13.53f, 21.74f, 13.75f, 21.66f, 13.87f, 21.51f)
                curveTo(13.95f, 21.41f, 13.97f, 21.29f, 13.94f, 21.14f)
                lineTo(13.66f, 19.91f)
                horizontalLineTo(10.36f)
                verticalLineTo(19.92f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.259f, 19.92f)
                curveTo(14.05f, 19.92f, 13.849f, 19.84f, 13.7f, 19.67f)
                curveTo(13.429f, 19.36f, 13.45f, 18.89f, 13.759f, 18.61f)
                lineTo(15.49f, 17.07f)
                curveTo(16.18f, 16.46f, 16.149f, 16.31f, 15.639f, 15.67f)
                lineTo(12.59f, 11.8f)
                curveTo(12.42f, 11.59f, 12.219f, 11.47f, 12.009f, 11.47f)
                curveTo(11.8f, 11.47f, 11.599f, 11.59f, 11.429f, 11.8f)
                lineTo(8.38f, 15.67f)
                curveTo(7.84f, 16.36f, 7.85f, 16.51f, 8.51f, 17.05f)
                lineTo(10.259f, 18.61f)
                curveTo(10.569f, 18.88f, 10.599f, 19.36f, 10.319f, 19.67f)
                curveTo(10.04f, 19.98f, 9.57f, 20.01f, 9.26f, 19.73f)
                lineTo(7.53f, 18.19f)
                curveTo(6.27f, 17.16f, 6.16f, 16.06f, 7.2f, 14.74f)
                lineTo(10.25f, 10.87f)
                curveTo(10.7f, 10.3f, 11.34f, 9.97f, 12.009f, 9.97f)
                curveTo(12.679f, 9.97f, 13.319f, 10.3f, 13.769f, 10.87f)
                lineTo(16.819f, 14.74f)
                curveTo(17.85f, 16.04f, 17.75f, 17.08f, 16.49f, 18.19f)
                lineTo(14.759f, 19.73f)
                curveTo(14.609f, 19.86f, 14.429f, 19.92f, 14.259f, 19.92f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.01f, 14.4f)
                curveTo(11.6f, 14.4f, 11.26f, 14.06f, 11.26f, 13.65f)
                verticalLineTo(11.12f)
                curveTo(11.26f, 10.71f, 11.6f, 10.37f, 12.01f, 10.37f)
                curveTo(12.42f, 10.37f, 12.76f, 10.71f, 12.76f, 11.12f)
                verticalLineTo(13.65f)
                curveTo(12.76f, 14.07f, 12.42f, 14.4f, 12.01f, 14.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 6.29f)
                curveTo(11.5f, 6.29f, 11f, 6.1f, 10.62f, 5.72f)
                lineTo(9.84f, 4.94f)
                curveTo(9.08f, 4.18f, 9.08f, 2.94f, 9.84f, 2.18f)
                lineTo(10.62f, 1.4f)
                curveTo(11.38f, 0.64f, 12.62f, 0.64f, 13.38f, 1.4f)
                lineTo(14.16f, 2.18f)
                curveTo(14.92f, 2.94f, 14.92f, 4.18f, 14.16f, 4.94f)
                lineTo(13.38f, 5.72f)
                curveTo(13f, 6.1f, 12.5f, 6.29f, 12f, 6.29f)
                close()
                moveTo(12f, 2.33f)
                curveTo(11.88f, 2.33f, 11.769f, 2.37f, 11.679f, 2.46f)
                lineTo(10.899f, 3.24f)
                curveTo(10.819f, 3.32f, 10.769f, 3.44f, 10.769f, 3.56f)
                curveTo(10.769f, 3.68f, 10.819f, 3.79f, 10.899f, 3.88f)
                lineTo(11.679f, 4.66f)
                curveTo(11.849f, 4.83f, 12.149f, 4.83f, 12.319f, 4.66f)
                lineTo(13.099f, 3.88f)
                curveTo(13.179f, 3.8f, 13.229f, 3.68f, 13.229f, 3.56f)
                curveTo(13.229f, 3.44f, 13.179f, 3.33f, 13.099f, 3.24f)
                lineTo(12.319f, 2.46f)
                curveTo(12.229f, 2.38f, 12.12f, 2.33f, 12f, 2.33f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.55f, 14.06f)
                horizontalLineTo(19.45f)
                curveTo(18.37f, 14.06f, 17.5f, 13.18f, 17.5f, 12.11f)
                verticalLineTo(11.01f)
                curveTo(17.5f, 9.93f, 18.38f, 9.06f, 19.45f, 9.06f)
                horizontalLineTo(20.55f)
                curveTo(21.63f, 9.06f, 22.5f, 9.94f, 22.5f, 11.01f)
                verticalLineTo(12.11f)
                curveTo(22.5f, 13.19f, 21.62f, 14.06f, 20.55f, 14.06f)
                close()
                moveTo(19.45f, 10.56f)
                curveTo(19.2f, 10.56f, 19f, 10.76f, 19f, 11.01f)
                verticalLineTo(12.11f)
                curveTo(19f, 12.36f, 19.2f, 12.56f, 19.45f, 12.56f)
                horizontalLineTo(20.55f)
                curveTo(20.8f, 12.56f, 21f, 12.36f, 21f, 12.11f)
                verticalLineTo(11.01f)
                curveTo(21f, 10.76f, 20.8f, 10.56f, 20.55f, 10.56f)
                horizontalLineTo(19.45f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.55f, 14.06f)
                horizontalLineTo(3.45f)
                curveTo(2.37f, 14.06f, 1.5f, 13.18f, 1.5f, 12.11f)
                verticalLineTo(11.01f)
                curveTo(1.5f, 9.93f, 2.38f, 9.06f, 3.45f, 9.06f)
                horizontalLineTo(4.55f)
                curveTo(5.63f, 9.06f, 6.5f, 9.94f, 6.5f, 11.01f)
                verticalLineTo(12.11f)
                curveTo(6.5f, 13.19f, 5.62f, 14.06f, 4.55f, 14.06f)
                close()
                moveTo(3.45f, 10.56f)
                curveTo(3.2f, 10.56f, 3f, 10.76f, 3f, 11.01f)
                verticalLineTo(12.11f)
                curveTo(3f, 12.36f, 3.2f, 12.56f, 3.45f, 12.56f)
                horizontalLineTo(4.55f)
                curveTo(4.8f, 12.56f, 5f, 12.36f, 5f, 12.11f)
                verticalLineTo(11.01f)
                curveTo(5f, 10.76f, 4.8f, 10.56f, 4.55f, 10.56f)
                horizontalLineTo(3.45f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.54f, 10.85f)
                curveTo(18.35f, 10.85f, 18.16f, 10.78f, 18.01f, 10.63f)
                lineTo(12.71f, 5.33f)
                curveTo(12.42f, 5.04f, 12.42f, 4.56f, 12.71f, 4.27f)
                curveTo(13f, 3.98f, 13.48f, 3.98f, 13.77f, 4.27f)
                lineTo(19.07f, 9.57f)
                curveTo(19.36f, 9.86f, 19.36f, 10.34f, 19.07f, 10.63f)
                curveTo(18.92f, 10.78f, 18.73f, 10.85f, 18.54f, 10.85f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.46f, 10.85f)
                curveTo(5.27f, 10.85f, 5.08f, 10.78f, 4.93f, 10.63f)
                curveTo(4.64f, 10.34f, 4.64f, 9.86f, 4.93f, 9.57f)
                lineTo(10.23f, 4.27f)
                curveTo(10.52f, 3.98f, 11f, 3.98f, 11.29f, 4.27f)
                curveTo(11.58f, 4.56f, 11.58f, 5.04f, 11.29f, 5.33f)
                lineTo(5.99f, 10.63f)
                curveTo(5.84f, 10.78f, 5.65f, 10.85f, 5.46f, 10.85f)
                close()
            }
        }.build()

        return _PenTool!!
    }

@Suppress("ObjectPropertyName")
private var _PenTool: ImageVector? = null
