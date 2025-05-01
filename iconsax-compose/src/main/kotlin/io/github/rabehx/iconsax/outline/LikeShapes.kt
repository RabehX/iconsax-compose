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

val Iconsax.Outline.LikeShapes: ImageVector
    get() {
        if (_LikeShapes != null) {
            return _LikeShapes!!
        }
        _LikeShapes = ImageVector.Builder(
            name = "Outline.LikeShapes",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.009f, 22.75f)
                curveTo(11.379f, 22.75f, 10.749f, 22.54f, 10.259f, 22.12f)
                lineTo(8.679f, 20.76f)
                curveTo(8.519f, 20.62f, 8.119f, 20.48f, 7.909f, 20.48f)
                horizontalLineTo(6.179f)
                curveTo(4.699f, 20.48f, 3.499f, 19.28f, 3.499f, 17.8f)
                verticalLineTo(16.09f)
                curveTo(3.499f, 15.88f, 3.359f, 15.49f, 3.219f, 15.33f)
                lineTo(1.869f, 13.74f)
                curveTo(1.049f, 12.77f, 1.049f, 11.24f, 1.869f, 10.27f)
                lineTo(3.219f, 8.68f)
                curveTo(3.359f, 8.52f, 3.499f, 8.13f, 3.499f, 7.92f)
                verticalLineTo(6.21f)
                curveTo(3.499f, 4.73f, 4.699f, 3.53f, 6.179f, 3.53f)
                horizontalLineTo(7.909f)
                curveTo(8.119f, 3.53f, 8.519f, 3.38f, 8.679f, 3.25f)
                lineTo(10.259f, 1.89f)
                curveTo(11.239f, 1.05f, 12.769f, 1.05f, 13.749f, 1.89f)
                lineTo(15.329f, 3.25f)
                curveTo(15.489f, 3.39f, 15.889f, 3.53f, 16.099f, 3.53f)
                horizontalLineTo(17.799f)
                curveTo(19.279f, 3.53f, 20.479f, 4.73f, 20.479f, 6.21f)
                verticalLineTo(7.91f)
                curveTo(20.479f, 8.12f, 20.629f, 8.52f, 20.769f, 8.68f)
                lineTo(22.119f, 10.26f)
                curveTo(22.959f, 11.24f, 22.959f, 12.77f, 22.119f, 13.75f)
                lineTo(20.769f, 15.33f)
                curveTo(20.629f, 15.49f, 20.489f, 15.89f, 20.489f, 16.1f)
                verticalLineTo(17.8f)
                curveTo(20.489f, 19.28f, 19.289f, 20.48f, 17.809f, 20.48f)
                horizontalLineTo(16.109f)
                curveTo(15.899f, 20.48f, 15.499f, 20.63f, 15.339f, 20.76f)
                lineTo(13.759f, 22.12f)
                curveTo(13.259f, 22.54f, 12.629f, 22.75f, 12.009f, 22.75f)
                close()
                moveTo(6.179f, 5.02f)
                curveTo(5.529f, 5.02f, 4.999f, 5.55f, 4.999f, 6.2f)
                verticalLineTo(7.91f)
                curveTo(4.999f, 8.48f, 4.729f, 9.21f, 4.369f, 9.64f)
                lineTo(3.019f, 11.23f)
                curveTo(2.669f, 11.64f, 2.669f, 12.35f, 3.019f, 12.76f)
                lineTo(4.369f, 14.35f)
                curveTo(4.739f, 14.79f, 5.009f, 15.52f, 5.009f, 16.08f)
                verticalLineTo(17.79f)
                curveTo(5.009f, 18.44f, 5.539f, 18.97f, 6.189f, 18.97f)
                horizontalLineTo(7.919f)
                curveTo(8.499f, 18.97f, 9.229f, 19.24f, 9.669f, 19.62f)
                lineTo(11.249f, 20.98f)
                curveTo(11.659f, 21.33f, 12.379f, 21.33f, 12.789f, 20.98f)
                lineTo(14.369f, 19.62f)
                curveTo(14.809f, 19.25f, 15.539f, 18.97f, 16.119f, 18.97f)
                horizontalLineTo(17.819f)
                curveTo(18.469f, 18.97f, 18.999f, 18.44f, 18.999f, 17.79f)
                verticalLineTo(16.09f)
                curveTo(18.999f, 15.51f, 19.269f, 14.78f, 19.649f, 14.34f)
                lineTo(20.999f, 12.76f)
                curveTo(21.349f, 12.35f, 21.349f, 11.63f, 20.999f, 11.22f)
                lineTo(19.649f, 9.64f)
                curveTo(19.279f, 9.2f, 18.999f, 8.47f, 18.999f, 7.89f)
                verticalLineTo(6.19f)
                curveTo(18.999f, 5.54f, 18.469f, 5.01f, 17.819f, 5.01f)
                horizontalLineTo(16.119f)
                curveTo(15.549f, 5.01f, 14.809f, 4.74f, 14.369f, 4.36f)
                lineTo(12.789f, 3f)
                curveTo(12.379f, 2.65f, 11.659f, 2.65f, 11.249f, 3f)
                lineTo(9.669f, 4.36f)
                curveTo(9.229f, 4.73f, 8.499f, 5.01f, 7.919f, 5.01f)
                horizontalLineTo(6.179f)
                verticalLineTo(5.02f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14f, 16.97f)
                horizontalLineTo(12.22f)
                curveTo(11.8f, 16.97f, 11.17f, 16.84f, 10.8f, 16.47f)
                lineTo(9.42f, 15.41f)
                lineTo(10.34f, 14.22f)
                lineTo(11.79f, 15.34f)
                curveTo(11.89f, 15.41f, 12.07f, 15.46f, 12.22f, 15.46f)
                horizontalLineTo(14f)
                curveTo(14.24f, 15.46f, 14.53f, 15.25f, 14.58f, 15.04f)
                lineTo(15.72f, 11.57f)
                curveTo(15.75f, 11.48f, 15.75f, 11.42f, 15.74f, 11.4f)
                curveTo(15.72f, 11.37f, 15.65f, 11.34f, 15.55f, 11.34f)
                horizontalLineTo(13.68f)
                curveTo(13.32f, 11.34f, 12.99f, 11.19f, 12.75f, 10.92f)
                curveTo(12.52f, 10.65f, 12.41f, 10.29f, 12.46f, 9.92f)
                lineTo(12.7f, 8.41f)
                curveTo(12.72f, 8.33f, 12.66f, 8.23f, 12.6f, 8.21f)
                curveTo(12.54f, 8.2f, 12.45f, 8.22f, 12.42f, 8.25f)
                lineTo(10.51f, 11.09f)
                lineTo(9.26f, 10.25f)
                lineTo(11.18f, 7.4f)
                curveTo(11.58f, 6.8f, 12.42f, 6.54f, 13.1f, 6.79f)
                curveTo(13.86f, 7.04f, 14.35f, 7.9f, 14.18f, 8.68f)
                lineTo(14f, 9.82f)
                horizontalLineTo(15.55f)
                curveTo(16.14f, 9.82f, 16.66f, 10.07f, 16.97f, 10.51f)
                curveTo(17.27f, 10.94f, 17.34f, 11.5f, 17.15f, 12.03f)
                lineTo(16.03f, 15.43f)
                curveTo(15.82f, 16.29f, 14.93f, 16.97f, 14f, 16.97f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.9f, 16.46f)
                horizontalLineTo(8.43f)
                curveTo(6.96f, 16.46f, 6.74f, 15.43f, 6.74f, 14.82f)
                verticalLineTo(10.24f)
                curveTo(6.74f, 9.63f, 6.96f, 8.6f, 8.43f, 8.6f)
                horizontalLineTo(8.9f)
                curveTo(10.37f, 8.6f, 10.59f, 9.63f, 10.59f, 10.24f)
                verticalLineTo(14.82f)
                curveTo(10.59f, 15.43f, 10.37f, 16.46f, 8.9f, 16.46f)
                close()
                moveTo(8.26f, 14.95f)
                curveTo(8.3f, 14.96f, 8.36f, 14.96f, 8.44f, 14.96f)
                horizontalLineTo(8.91f)
                curveTo(8.99f, 14.96f, 9.05f, 14.96f, 9.09f, 14.95f)
                curveTo(9.09f, 14.92f, 9.1f, 14.88f, 9.1f, 14.82f)
                verticalLineTo(10.24f)
                curveTo(9.1f, 10.18f, 9.1f, 10.14f, 9.09f, 10.11f)
                curveTo(9.05f, 10.1f, 8.99f, 10.1f, 8.91f, 10.1f)
                horizontalLineTo(8.44f)
                curveTo(8.36f, 10.1f, 8.3f, 10.1f, 8.26f, 10.11f)
                curveTo(8.26f, 10.14f, 8.25f, 10.18f, 8.25f, 10.24f)
                verticalLineTo(14.82f)
                curveTo(8.25f, 14.88f, 8.25f, 14.92f, 8.26f, 14.95f)
                close()
            }
        }.build()

        return _LikeShapes!!
    }

@Suppress("ObjectPropertyName")
private var _LikeShapes: ImageVector? = null
