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


val Iconsax.Outline.ThreeDcube: ImageVector
    get() {
        if (_3Dcube != null) {
            return _3Dcube!!
        }
        _3Dcube = ImageVector.Builder(
            name = "Outline.3Dcube",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 12.25f)
                curveTo(11.56f, 12.25f, 11.12f, 12.14f, 10.72f, 11.93f)
                lineTo(4.21f, 8.42f)
                curveTo(3.62f, 8.1f, 3.25f, 7.47f, 3.25f, 6.77f)
                curveTo(3.25f, 6.07f, 3.62f, 5.44f, 4.21f, 5.12f)
                lineTo(10.72f, 1.61f)
                curveTo(11.52f, 1.18f, 12.48f, 1.18f, 13.27f, 1.61f)
                lineTo(19.78f, 5.12f)
                curveTo(20.37f, 5.44f, 20.74f, 6.07f, 20.74f, 6.77f)
                curveTo(20.74f, 7.47f, 20.37f, 8.1f, 19.78f, 8.42f)
                lineTo(13.27f, 11.93f)
                curveTo(12.88f, 12.15f, 12.44f, 12.25f, 12f, 12.25f)
                close()
                moveTo(12f, 2.78f)
                curveTo(11.81f, 2.78f, 11.61f, 2.83f, 11.43f, 2.93f)
                lineTo(4.93f, 6.43f)
                curveTo(4.76f, 6.52f, 4.75f, 6.71f, 4.75f, 6.77f)
                curveTo(4.75f, 6.83f, 4.76f, 7.02f, 4.93f, 7.1f)
                lineTo(11.44f, 10.61f)
                curveTo(11.8f, 10.8f, 12.21f, 10.8f, 12.57f, 10.61f)
                lineTo(19.08f, 7.1f)
                curveTo(19.24f, 7.01f, 19.26f, 6.82f, 19.26f, 6.77f)
                curveTo(19.26f, 6.71f, 19.25f, 6.52f, 19.08f, 6.44f)
                lineTo(12.57f, 2.93f)
                curveTo(12.39f, 2.83f, 12.19f, 2.78f, 12f, 2.78f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.78f, 22.72f)
                curveTo(9.5f, 22.72f, 9.21f, 22.65f, 8.95f, 22.52f)
                lineTo(2.89f, 19.5f)
                curveTo(1.88f, 18.99f, 1.25f, 17.97f, 1.25f, 16.84f)
                verticalLineTo(11.12f)
                curveTo(1.25f, 10.47f, 1.58f, 9.88f, 2.13f, 9.54f)
                curveTo(2.69f, 9.2f, 3.36f, 9.17f, 3.94f, 9.46f)
                lineTo(10f, 12.48f)
                curveTo(11.01f, 12.99f, 11.64f, 14f, 11.64f, 15.14f)
                verticalLineTo(20.86f)
                curveTo(11.64f, 21.51f, 11.31f, 22.1f, 10.76f, 22.44f)
                curveTo(10.46f, 22.63f, 10.12f, 22.72f, 9.78f, 22.72f)
                close()
                moveTo(3.11f, 10.76f)
                curveTo(3.03f, 10.76f, 2.96f, 10.79f, 2.92f, 10.81f)
                curveTo(2.86f, 10.85f, 2.75f, 10.94f, 2.75f, 11.12f)
                verticalLineTo(16.84f)
                curveTo(2.75f, 17.4f, 3.06f, 17.91f, 3.56f, 18.16f)
                lineTo(9.61f, 21.19f)
                curveTo(9.77f, 21.27f, 9.9f, 21.21f, 9.96f, 21.18f)
                curveTo(10.02f, 21.14f, 10.13f, 21.05f, 10.13f, 20.87f)
                verticalLineTo(15.15f)
                curveTo(10.13f, 14.59f, 9.82f, 14.08f, 9.32f, 13.83f)
                lineTo(3.27f, 10.8f)
                curveTo(3.21f, 10.77f, 3.16f, 10.76f, 3.11f, 10.76f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.219f, 22.72f)
                curveTo(13.879f, 22.72f, 13.539f, 22.63f, 13.239f, 22.44f)
                curveTo(12.689f, 22.1f, 12.359f, 21.51f, 12.359f, 20.86f)
                verticalLineTo(15.14f)
                curveTo(12.359f, 14.01f, 12.989f, 12.99f, 13.999f, 12.48f)
                lineTo(20.049f, 9.45f)
                curveTo(20.629f, 9.16f, 21.309f, 9.19f, 21.859f, 9.53f)
                curveTo(22.409f, 9.87f, 22.739f, 10.46f, 22.739f, 11.11f)
                verticalLineTo(16.83f)
                curveTo(22.739f, 17.96f, 22.109f, 18.98f, 21.099f, 19.49f)
                lineTo(15.049f, 22.52f)
                curveTo(14.789f, 22.66f, 14.499f, 22.72f, 14.219f, 22.72f)
                close()
                moveTo(20.889f, 10.76f)
                curveTo(20.839f, 10.76f, 20.789f, 10.77f, 20.729f, 10.8f)
                lineTo(14.679f, 13.83f)
                curveTo(14.179f, 14.08f, 13.869f, 14.58f, 13.869f, 15.15f)
                verticalLineTo(20.87f)
                curveTo(13.869f, 21.05f, 13.979f, 21.14f, 14.039f, 21.18f)
                curveTo(14.099f, 21.22f, 14.229f, 21.27f, 14.389f, 21.19f)
                lineTo(20.439f, 18.16f)
                curveTo(20.939f, 17.91f, 21.249f, 17.4f, 21.249f, 16.84f)
                verticalLineTo(11.12f)
                curveTo(21.249f, 10.94f, 21.139f, 10.85f, 21.079f, 10.81f)
                curveTo(21.039f, 10.79f, 20.969f, 10.76f, 20.889f, 10.76f)
                close()
            }
        }.build()

        return _3Dcube!!
    }

@Suppress("ObjectPropertyName")
private var _3Dcube: ImageVector? = null


