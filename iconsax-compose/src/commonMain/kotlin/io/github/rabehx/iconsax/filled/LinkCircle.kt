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


val Iconsax.Filled.LinkCircle: ImageVector
    get() {
        if (_LinkCircle != null) {
            return _LinkCircle!!
        }
        _LinkCircle = ImageVector.Builder(
            name = "Filled.LinkCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                curveTo(2f, 17.52f, 6.48f, 22f, 12f, 22f)
                curveTo(17.52f, 22f, 22f, 17.52f, 22f, 12f)
                curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                close()
                moveTo(8.65f, 14.77f)
                curveTo(8.54f, 15.07f, 8.25f, 15.26f, 7.95f, 15.26f)
                curveTo(7.86f, 15.26f, 7.78f, 15.25f, 7.69f, 15.21f)
                curveTo(6.88f, 14.91f, 6.2f, 14.32f, 5.77f, 13.55f)
                curveTo(4.77f, 11.75f, 5.39f, 9.4f, 7.14f, 8.31f)
                lineTo(9.48f, 6.86f)
                curveTo(10.34f, 6.33f, 11.35f, 6.17f, 12.31f, 6.42f)
                curveTo(13.27f, 6.67f, 14.08f, 7.3f, 14.57f, 8.18f)
                curveTo(15.57f, 9.98f, 14.95f, 12.33f, 13.2f, 13.42f)
                lineTo(12.94f, 13.61f)
                curveTo(12.6f, 13.85f, 12.13f, 13.77f, 11.89f, 13.44f)
                curveTo(11.65f, 13.1f, 11.73f, 12.63f, 12.06f, 12.39f)
                lineTo(12.37f, 12.17f)
                curveTo(13.49f, 11.47f, 13.87f, 10.02f, 13.26f, 8.91f)
                curveTo(12.97f, 8.39f, 12.5f, 8.02f, 11.94f, 7.87f)
                curveTo(11.38f, 7.72f, 10.79f, 7.81f, 10.28f, 8.13f)
                lineTo(7.92f, 9.59f)
                curveTo(6.84f, 10.26f, 6.46f, 11.71f, 7.07f, 12.83f)
                curveTo(7.32f, 13.28f, 7.72f, 13.63f, 8.2f, 13.81f)
                curveTo(8.59f, 13.95f, 8.79f, 14.38f, 8.65f, 14.77f)
                close()
                moveTo(16.92f, 15.65f)
                lineTo(14.58f, 17.1f)
                curveTo(13.99f, 17.47f, 13.33f, 17.65f, 12.66f, 17.65f)
                curveTo(12.36f, 17.65f, 12.05f, 17.61f, 11.75f, 17.53f)
                curveTo(10.79f, 17.28f, 9.98f, 16.65f, 9.5f, 15.77f)
                curveTo(8.5f, 13.97f, 9.12f, 11.62f, 10.87f, 10.53f)
                lineTo(11.13f, 10.34f)
                curveTo(11.47f, 10.1f, 11.94f, 10.18f, 12.18f, 10.51f)
                curveTo(12.42f, 10.85f, 12.34f, 11.32f, 12.01f, 11.56f)
                lineTo(11.7f, 11.78f)
                curveTo(10.58f, 12.48f, 10.2f, 13.93f, 10.81f, 15.04f)
                curveTo(11.1f, 15.56f, 11.57f, 15.93f, 12.13f, 16.08f)
                curveTo(12.69f, 16.23f, 13.28f, 16.14f, 13.79f, 15.82f)
                lineTo(16.13f, 14.37f)
                curveTo(17.21f, 13.7f, 17.59f, 12.25f, 16.98f, 11.13f)
                curveTo(16.73f, 10.68f, 16.33f, 10.33f, 15.85f, 10.15f)
                curveTo(15.46f, 10.01f, 15.26f, 9.58f, 15.41f, 9.19f)
                curveTo(15.55f, 8.8f, 15.99f, 8.6f, 16.37f, 8.75f)
                curveTo(17.18f, 9.05f, 17.86f, 9.64f, 18.29f, 10.41f)
                curveTo(19.28f, 12.21f, 18.67f, 14.56f, 16.92f, 15.65f)
                close()
            }
        }.build()

        return _LinkCircle!!
    }

@Suppress("ObjectPropertyName")
private var _LinkCircle: ImageVector? = null
