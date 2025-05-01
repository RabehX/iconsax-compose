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

val Iconsax.Outline.Note: ImageVector
    get() {
        if (_Note != null) {
            return _Note!!
        }
        _Note = ImageVector.Builder(
            name = "Outline.Note",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.81f, 20.18f)
                curveTo(15.55f, 20.18f, 15.28f, 20.17f, 14.99f, 20.14f)
                curveTo(14.47f, 20.1f, 13.88f, 20f, 13.27f, 19.85f)
                lineTo(11.59f, 19.45f)
                curveTo(6.98f, 18.36f, 5.47f, 15.92f, 6.55f, 11.32f)
                lineTo(7.53f, 7.13f)
                curveTo(7.75f, 6.18f, 8.01f, 5.41f, 8.33f, 4.77f)
                curveTo(10.05f, 1.22f, 13.34f, 1.54f, 15.68f, 2.09f)
                lineTo(17.35f, 2.48f)
                curveTo(19.69f, 3.03f, 21.17f, 3.9f, 22f, 5.23f)
                curveTo(22.82f, 6.56f, 22.95f, 8.27f, 22.4f, 10.61f)
                lineTo(21.42f, 14.79f)
                curveTo(20.56f, 18.45f, 18.77f, 20.18f, 15.81f, 20.18f)
                close()
                moveTo(13.12f, 3.25f)
                curveTo(11.45f, 3.25f, 10.39f, 3.94f, 9.68f, 5.42f)
                curveTo(9.42f, 5.96f, 9.19f, 6.63f, 8.99f, 7.47f)
                lineTo(8.01f, 11.66f)
                curveTo(7.12f, 15.44f, 8.15f, 17.09f, 11.93f, 17.99f)
                lineTo(13.61f, 18.39f)
                curveTo(14.15f, 18.52f, 14.66f, 18.6f, 15.12f, 18.64f)
                curveTo(17.83f, 18.91f, 19.19f, 17.72f, 19.95f, 14.45f)
                lineTo(20.93f, 10.27f)
                curveTo(21.38f, 8.34f, 21.32f, 6.99f, 20.72f, 6.02f)
                curveTo(20.12f, 5.05f, 18.94f, 4.39f, 17f, 3.94f)
                lineTo(15.33f, 3.55f)
                curveTo(14.5f, 3.35f, 13.76f, 3.25f, 13.12f, 3.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.329f, 22.25f)
                curveTo(5.759f, 22.25f, 4.119f, 20.71f, 3.069f, 17.46f)
                lineTo(1.789f, 13.51f)
                curveTo(0.369f, 9.11f, 1.639f, 6.63f, 6.019f, 5.21f)
                lineTo(7.599f, 4.7f)
                curveTo(8.119f, 4.54f, 8.509f, 4.43f, 8.859f, 4.37f)
                curveTo(9.139f, 4.31f, 9.429f, 4.42f, 9.599f, 4.65f)
                curveTo(9.769f, 4.88f, 9.799f, 5.18f, 9.679f, 5.44f)
                curveTo(9.419f, 5.97f, 9.189f, 6.64f, 8.999f, 7.48f)
                lineTo(8.019f, 11.67f)
                curveTo(7.129f, 15.45f, 8.159f, 17.1f, 11.939f, 18f)
                lineTo(13.619f, 18.4f)
                curveTo(14.159f, 18.53f, 14.669f, 18.61f, 15.129f, 18.65f)
                curveTo(15.449f, 18.68f, 15.709f, 18.9f, 15.799f, 19.21f)
                curveTo(15.879f, 19.52f, 15.759f, 19.84f, 15.499f, 20.02f)
                curveTo(14.839f, 20.47f, 14.009f, 20.85f, 12.959f, 21.19f)
                lineTo(11.379f, 21.71f)
                curveTo(10.229f, 22.07f, 9.229f, 22.25f, 8.329f, 22.25f)
                close()
                moveTo(7.779f, 6.22f)
                lineTo(6.489f, 6.64f)
                curveTo(2.919f, 7.79f, 2.069f, 9.47f, 3.219f, 13.05f)
                lineTo(4.499f, 17f)
                curveTo(5.659f, 20.57f, 7.339f, 21.43f, 10.909f, 20.28f)
                lineTo(12.489f, 19.76f)
                curveTo(12.549f, 19.74f, 12.599f, 19.72f, 12.659f, 19.7f)
                lineTo(11.599f, 19.45f)
                curveTo(6.989f, 18.36f, 5.479f, 15.92f, 6.559f, 11.32f)
                lineTo(7.539f, 7.13f)
                curveTo(7.609f, 6.81f, 7.689f, 6.5f, 7.779f, 6.22f)
                close()
            }
        }.build()

        return _Note!!
    }

@Suppress("ObjectPropertyName")
private var _Note: ImageVector? = null
