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

val Iconsax.Outline.Information: ImageVector
    get() {
        if (_Information != null) {
            return _Information!!
        }
        _Information = ImageVector.Builder(
            name = "Outline.Information",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.009f, 22.74f)
                curveTo(11.379f, 22.74f, 10.759f, 22.53f, 10.269f, 22.11f)
                lineTo(8.689f, 20.76f)
                curveTo(8.529f, 20.62f, 8.129f, 20.48f, 7.919f, 20.48f)
                horizontalLineTo(6.169f)
                curveTo(4.689f, 20.48f, 3.489f, 19.28f, 3.489f, 17.8f)
                verticalLineTo(16.09f)
                curveTo(3.489f, 15.88f, 3.349f, 15.48f, 3.219f, 15.33f)
                lineTo(1.859f, 13.73f)
                curveTo(1.039f, 12.76f, 1.039f, 11.24f, 1.859f, 10.26f)
                lineTo(3.219f, 8.66f)
                curveTo(3.349f, 8.51f, 3.489f, 8.11f, 3.489f, 7.9f)
                verticalLineTo(6.2f)
                curveTo(3.489f, 4.72f, 4.689f, 3.52f, 6.169f, 3.52f)
                horizontalLineTo(7.899f)
                curveTo(8.109f, 3.52f, 8.499f, 3.37f, 8.669f, 3.23f)
                lineTo(10.249f, 1.88f)
                curveTo(11.229f, 1.05f, 12.759f, 1.05f, 13.739f, 1.88f)
                lineTo(15.319f, 3.23f)
                curveTo(15.479f, 3.37f, 15.889f, 3.51f, 16.099f, 3.51f)
                horizontalLineTo(17.799f)
                curveTo(19.279f, 3.51f, 20.479f, 4.71f, 20.479f, 6.19f)
                verticalLineTo(7.89f)
                curveTo(20.479f, 8.1f, 20.629f, 8.49f, 20.769f, 8.66f)
                lineTo(22.119f, 10.24f)
                curveTo(22.959f, 11.23f, 22.949f, 12.76f, 22.119f, 13.73f)
                lineTo(20.769f, 15.31f)
                curveTo(20.629f, 15.48f, 20.489f, 15.87f, 20.489f, 16.08f)
                verticalLineTo(17.78f)
                curveTo(20.489f, 19.26f, 19.289f, 20.46f, 17.809f, 20.46f)
                horizontalLineTo(16.109f)
                curveTo(15.899f, 20.46f, 15.509f, 20.61f, 15.329f, 20.75f)
                lineTo(13.749f, 22.1f)
                curveTo(13.259f, 22.53f, 12.629f, 22.74f, 12.009f, 22.74f)
                close()
                moveTo(6.169f, 5.02f)
                curveTo(5.519f, 5.02f, 4.989f, 5.55f, 4.989f, 6.2f)
                verticalLineTo(7.9f)
                curveTo(4.989f, 8.47f, 4.729f, 9.19f, 4.359f, 9.63f)
                lineTo(2.999f, 11.23f)
                curveTo(2.659f, 11.64f, 2.659f, 12.36f, 2.999f, 12.76f)
                lineTo(4.349f, 14.35f)
                curveTo(4.709f, 14.76f, 4.979f, 15.51f, 4.979f, 16.08f)
                verticalLineTo(17.79f)
                curveTo(4.979f, 18.44f, 5.509f, 18.97f, 6.159f, 18.97f)
                horizontalLineTo(7.899f)
                curveTo(8.459f, 18.97f, 9.199f, 19.24f, 9.639f, 19.61f)
                lineTo(11.229f, 20.97f)
                curveTo(11.639f, 21.32f, 12.359f, 21.32f, 12.769f, 20.97f)
                lineTo(14.349f, 19.62f)
                curveTo(14.799f, 19.24f, 15.529f, 18.98f, 16.089f, 18.98f)
                horizontalLineTo(17.789f)
                curveTo(18.439f, 18.98f, 18.969f, 18.45f, 18.969f, 17.8f)
                verticalLineTo(16.1f)
                curveTo(18.969f, 15.54f, 19.239f, 14.81f, 19.609f, 14.36f)
                lineTo(20.969f, 12.77f)
                curveTo(21.319f, 12.36f, 21.319f, 11.64f, 20.969f, 11.23f)
                lineTo(19.619f, 9.65f)
                curveTo(19.239f, 9.2f, 18.979f, 8.47f, 18.979f, 7.91f)
                verticalLineTo(6.2f)
                curveTo(18.979f, 5.55f, 18.449f, 5.02f, 17.799f, 5.02f)
                horizontalLineTo(16.099f)
                curveTo(15.529f, 5.02f, 14.789f, 4.75f, 14.349f, 4.38f)
                lineTo(12.759f, 3.02f)
                curveTo(12.349f, 2.67f, 11.639f, 2.67f, 11.219f, 3.02f)
                lineTo(9.649f, 4.38f)
                curveTo(9.199f, 4.75f, 8.469f, 5.02f, 7.899f, 5.02f)
                horizontalLineTo(6.169f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 16.87f)
                curveTo(11.45f, 16.87f, 11f, 16.42f, 11f, 15.87f)
                curveTo(11f, 15.32f, 11.44f, 14.87f, 12f, 14.87f)
                curveTo(12.55f, 14.87f, 13f, 15.32f, 13f, 15.87f)
                curveTo(13f, 16.42f, 12.56f, 16.87f, 12f, 16.87f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 13.72f)
                curveTo(11.59f, 13.72f, 11.25f, 13.38f, 11.25f, 12.97f)
                verticalLineTo(8.13f)
                curveTo(11.25f, 7.72f, 11.59f, 7.38f, 12f, 7.38f)
                curveTo(12.41f, 7.38f, 12.75f, 7.72f, 12.75f, 8.13f)
                verticalLineTo(12.96f)
                curveTo(12.75f, 13.38f, 12.42f, 13.72f, 12f, 13.72f)
                close()
            }
        }.build()

        return _Information!!
    }

@Suppress("ObjectPropertyName")
private var _Information: ImageVector? = null
