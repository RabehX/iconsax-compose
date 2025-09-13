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


val Iconsax.Filled.ProfileCircle: ImageVector
    get() {
        if (_ProfileCircle != null) {
            return _ProfileCircle!!
        }
        _ProfileCircle = ImageVector.Builder(
            name = "Filled.ProfileCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 12f)
                curveTo(22f, 6.49f, 17.51f, 2f, 12f, 2f)
                curveTo(6.49f, 2f, 2f, 6.49f, 2f, 12f)
                curveTo(2f, 14.9f, 3.25f, 17.51f, 5.23f, 19.34f)
                curveTo(5.23f, 19.35f, 5.23f, 19.35f, 5.22f, 19.36f)
                curveTo(5.32f, 19.46f, 5.44f, 19.54f, 5.54f, 19.63f)
                curveTo(5.6f, 19.68f, 5.65f, 19.73f, 5.71f, 19.77f)
                curveTo(5.89f, 19.92f, 6.09f, 20.06f, 6.28f, 20.2f)
                curveTo(6.35f, 20.25f, 6.41f, 20.29f, 6.48f, 20.34f)
                curveTo(6.67f, 20.47f, 6.87f, 20.59f, 7.08f, 20.7f)
                curveTo(7.15f, 20.74f, 7.23f, 20.79f, 7.3f, 20.83f)
                curveTo(7.5f, 20.94f, 7.71f, 21.04f, 7.93f, 21.13f)
                curveTo(8.01f, 21.17f, 8.09f, 21.21f, 8.17f, 21.24f)
                curveTo(8.39f, 21.33f, 8.61f, 21.41f, 8.83f, 21.48f)
                curveTo(8.91f, 21.51f, 8.99f, 21.54f, 9.07f, 21.56f)
                curveTo(9.31f, 21.63f, 9.55f, 21.69f, 9.79f, 21.75f)
                curveTo(9.86f, 21.77f, 9.93f, 21.79f, 10.01f, 21.8f)
                curveTo(10.29f, 21.86f, 10.57f, 21.9f, 10.86f, 21.93f)
                curveTo(10.9f, 21.93f, 10.94f, 21.94f, 10.98f, 21.95f)
                curveTo(11.32f, 21.98f, 11.66f, 22f, 12f, 22f)
                curveTo(12.34f, 22f, 12.68f, 21.98f, 13.01f, 21.95f)
                curveTo(13.05f, 21.95f, 13.09f, 21.94f, 13.13f, 21.93f)
                curveTo(13.42f, 21.9f, 13.7f, 21.86f, 13.98f, 21.8f)
                curveTo(14.05f, 21.79f, 14.12f, 21.76f, 14.2f, 21.75f)
                curveTo(14.44f, 21.69f, 14.69f, 21.64f, 14.92f, 21.56f)
                curveTo(15f, 21.53f, 15.08f, 21.5f, 15.16f, 21.48f)
                curveTo(15.38f, 21.4f, 15.61f, 21.33f, 15.82f, 21.24f)
                curveTo(15.9f, 21.21f, 15.98f, 21.17f, 16.06f, 21.13f)
                curveTo(16.27f, 21.04f, 16.48f, 20.94f, 16.69f, 20.83f)
                curveTo(16.77f, 20.79f, 16.84f, 20.74f, 16.91f, 20.7f)
                curveTo(17.11f, 20.58f, 17.31f, 20.47f, 17.51f, 20.34f)
                curveTo(17.58f, 20.3f, 17.64f, 20.25f, 17.71f, 20.2f)
                curveTo(17.91f, 20.06f, 18.1f, 19.92f, 18.28f, 19.77f)
                curveTo(18.34f, 19.72f, 18.39f, 19.67f, 18.45f, 19.63f)
                curveTo(18.56f, 19.54f, 18.67f, 19.45f, 18.77f, 19.36f)
                curveTo(18.77f, 19.35f, 18.77f, 19.35f, 18.76f, 19.34f)
                curveTo(20.75f, 17.51f, 22f, 14.9f, 22f, 12f)
                close()
                moveTo(16.94f, 16.97f)
                curveTo(14.23f, 15.15f, 9.79f, 15.15f, 7.06f, 16.97f)
                curveTo(6.62f, 17.26f, 6.26f, 17.6f, 5.96f, 17.97f)
                curveTo(4.44f, 16.43f, 3.5f, 14.32f, 3.5f, 12f)
                curveTo(3.5f, 7.31f, 7.31f, 3.5f, 12f, 3.5f)
                curveTo(16.69f, 3.5f, 20.5f, 7.31f, 20.5f, 12f)
                curveTo(20.5f, 14.32f, 19.56f, 16.43f, 18.04f, 17.97f)
                curveTo(17.75f, 17.6f, 17.38f, 17.26f, 16.94f, 16.97f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 6.93f)
                curveTo(9.93f, 6.93f, 8.25f, 8.61f, 8.25f, 10.68f)
                curveTo(8.25f, 12.71f, 9.84f, 14.36f, 11.95f, 14.42f)
                curveTo(11.98f, 14.42f, 12.02f, 14.42f, 12.04f, 14.42f)
                curveTo(12.06f, 14.42f, 12.09f, 14.42f, 12.11f, 14.42f)
                curveTo(12.12f, 14.42f, 12.13f, 14.42f, 12.13f, 14.42f)
                curveTo(14.15f, 14.35f, 15.74f, 12.71f, 15.75f, 10.68f)
                curveTo(15.75f, 8.61f, 14.07f, 6.93f, 12f, 6.93f)
                close()
            }
        }.build()

        return _ProfileCircle!!
    }

@Suppress("ObjectPropertyName")
private var _ProfileCircle: ImageVector? = null
