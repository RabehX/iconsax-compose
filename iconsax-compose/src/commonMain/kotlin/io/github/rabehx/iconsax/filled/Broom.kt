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

package io.github.rabehx.iconsax.filled


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax


val Iconsax.Filled.Broom: ImageVector
    get() {
        if (_Broom != null) {
            return _Broom!!
        }
        _Broom = ImageVector.Builder(
            name = "Filled.Broom",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.82f, 4.901f)
                lineTo(7.54f, 2.781f)
                curveTo(7.06f, 2.001f, 6.11f, 1.561f, 5.22f, 1.821f)
                curveTo(3.88f, 2.221f, 3.36f, 3.731f, 4.03f, 4.841f)
                lineTo(5.35f, 7.011f)
                curveTo(5.5f, 7.241f, 5.81f, 7.321f, 6.04f, 7.181f)
                lineTo(8.65f, 5.591f)
                curveTo(8.89f, 5.441f, 8.97f, 5.131f, 8.82f, 4.901f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.74f, 14.21f)
                lineTo(16.93f, 10.41f)
                curveTo(15.95f, 9.09f, 14.25f, 8.47f, 12.65f, 8.9f)
                curveTo(12.65f, 8.89f, 12.64f, 8.89f, 12.64f, 8.88f)
                lineTo(10.98f, 6.15f)
                curveTo(10.68f, 5.68f, 10.06f, 5.53f, 9.59f, 5.82f)
                lineTo(6.12f, 7.93f)
                curveTo(5.64f, 8.21f, 5.49f, 8.84f, 5.78f, 9.32f)
                lineTo(7.43f, 12.05f)
                curveTo(7.43f, 12.05f, 7.43f, 12.06f, 7.44f, 12.06f)
                curveTo(6.33f, 13.29f, 6.09f, 15.08f, 6.83f, 16.57f)
                lineTo(8.91f, 20.81f)
                curveTo(9.55f, 22.12f, 11.06f, 22.62f, 12.34f, 21.96f)
                curveTo(12.44f, 21.91f, 12.47f, 21.79f, 12.41f, 21.69f)
                lineTo(10.85f, 19.11f)
                curveTo(10.63f, 18.75f, 10.74f, 18.29f, 11.1f, 18.06f)
                curveTo(11.46f, 17.85f, 11.92f, 17.96f, 12.15f, 18.31f)
                lineTo(13.72f, 20.89f)
                curveTo(13.78f, 20.98f, 13.9f, 21.01f, 13.99f, 20.96f)
                lineTo(14.95f, 20.38f)
                curveTo(15.04f, 20.32f, 15.07f, 20.2f, 15.02f, 20.11f)
                lineTo(13.45f, 17.53f)
                curveTo(13.24f, 17.17f, 13.35f, 16.71f, 13.7f, 16.48f)
                curveTo(14.07f, 16.27f, 14.53f, 16.38f, 14.75f, 16.73f)
                lineTo(16.32f, 19.31f)
                curveTo(16.38f, 19.4f, 16.5f, 19.43f, 16.59f, 19.38f)
                lineTo(17.55f, 18.8f)
                curveTo(17.64f, 18.74f, 17.67f, 18.62f, 17.62f, 18.53f)
                lineTo(16.05f, 15.95f)
                curveTo(15.84f, 15.59f, 15.95f, 15.13f, 16.3f, 14.9f)
                curveTo(16.67f, 14.69f, 17.13f, 14.8f, 17.35f, 15.15f)
                lineTo(18.93f, 17.72f)
                curveTo(18.99f, 17.81f, 19.11f, 17.84f, 19.2f, 17.78f)
                curveTo(20.36f, 16.95f, 20.62f, 15.39f, 19.74f, 14.21f)
                close()
            }
        }.build()

        return _Broom!!
    }

@Suppress("ObjectPropertyName")
private var _Broom: ImageVector? = null
