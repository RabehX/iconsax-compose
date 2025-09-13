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


val Iconsax.Filled.Calendar: ImageVector
    get() {
        if (_Calendar != null) {
            return _Calendar!!
        }
        _Calendar = ImageVector.Builder(
            name = "Filled.Calendar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.75f, 3.56f)
                verticalLineTo(2f)
                curveTo(16.75f, 1.59f, 16.41f, 1.25f, 16f, 1.25f)
                curveTo(15.59f, 1.25f, 15.25f, 1.59f, 15.25f, 2f)
                verticalLineTo(3.5f)
                horizontalLineTo(8.75f)
                verticalLineTo(2f)
                curveTo(8.75f, 1.59f, 8.41f, 1.25f, 8f, 1.25f)
                curveTo(7.59f, 1.25f, 7.25f, 1.59f, 7.25f, 2f)
                verticalLineTo(3.56f)
                curveTo(4.55f, 3.81f, 3.24f, 5.42f, 3.04f, 7.81f)
                curveTo(3.02f, 8.1f, 3.26f, 8.34f, 3.54f, 8.34f)
                horizontalLineTo(20.46f)
                curveTo(20.75f, 8.34f, 20.99f, 8.09f, 20.96f, 7.81f)
                curveTo(20.76f, 5.42f, 19.45f, 3.81f, 16.75f, 3.56f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20f, 9.84f)
                horizontalLineTo(4f)
                curveTo(3.45f, 9.84f, 3f, 10.29f, 3f, 10.84f)
                verticalLineTo(17f)
                curveTo(3f, 20f, 4.5f, 22f, 8f, 22f)
                horizontalLineTo(16f)
                curveTo(19.5f, 22f, 21f, 20f, 21f, 17f)
                verticalLineTo(10.84f)
                curveTo(21f, 10.29f, 20.55f, 9.84f, 20f, 9.84f)
                close()
                moveTo(9.21f, 18.21f)
                curveTo(9.16f, 18.25f, 9.11f, 18.3f, 9.06f, 18.33f)
                curveTo(9f, 18.37f, 8.94f, 18.4f, 8.88f, 18.42f)
                curveTo(8.82f, 18.45f, 8.76f, 18.47f, 8.7f, 18.48f)
                curveTo(8.63f, 18.49f, 8.57f, 18.5f, 8.5f, 18.5f)
                curveTo(8.37f, 18.5f, 8.24f, 18.47f, 8.12f, 18.42f)
                curveTo(7.99f, 18.37f, 7.89f, 18.3f, 7.79f, 18.21f)
                curveTo(7.61f, 18.02f, 7.5f, 17.76f, 7.5f, 17.5f)
                curveTo(7.5f, 17.24f, 7.61f, 16.98f, 7.79f, 16.79f)
                curveTo(7.89f, 16.7f, 7.99f, 16.63f, 8.12f, 16.58f)
                curveTo(8.3f, 16.5f, 8.5f, 16.48f, 8.7f, 16.52f)
                curveTo(8.76f, 16.53f, 8.82f, 16.55f, 8.88f, 16.58f)
                curveTo(8.94f, 16.6f, 9f, 16.63f, 9.06f, 16.67f)
                curveTo(9.11f, 16.71f, 9.16f, 16.75f, 9.21f, 16.79f)
                curveTo(9.39f, 16.98f, 9.5f, 17.24f, 9.5f, 17.5f)
                curveTo(9.5f, 17.76f, 9.39f, 18.02f, 9.21f, 18.21f)
                close()
                moveTo(9.21f, 14.71f)
                curveTo(9.02f, 14.89f, 8.76f, 15f, 8.5f, 15f)
                curveTo(8.24f, 15f, 7.98f, 14.89f, 7.79f, 14.71f)
                curveTo(7.61f, 14.52f, 7.5f, 14.26f, 7.5f, 14f)
                curveTo(7.5f, 13.74f, 7.61f, 13.48f, 7.79f, 13.29f)
                curveTo(8.07f, 13.01f, 8.51f, 12.92f, 8.88f, 13.08f)
                curveTo(9.01f, 13.13f, 9.12f, 13.2f, 9.21f, 13.29f)
                curveTo(9.39f, 13.48f, 9.5f, 13.74f, 9.5f, 14f)
                curveTo(9.5f, 14.26f, 9.39f, 14.52f, 9.21f, 14.71f)
                close()
                moveTo(12.71f, 18.21f)
                curveTo(12.52f, 18.39f, 12.26f, 18.5f, 12f, 18.5f)
                curveTo(11.74f, 18.5f, 11.48f, 18.39f, 11.29f, 18.21f)
                curveTo(11.11f, 18.02f, 11f, 17.76f, 11f, 17.5f)
                curveTo(11f, 17.24f, 11.11f, 16.98f, 11.29f, 16.79f)
                curveTo(11.66f, 16.42f, 12.34f, 16.42f, 12.71f, 16.79f)
                curveTo(12.89f, 16.98f, 13f, 17.24f, 13f, 17.5f)
                curveTo(13f, 17.76f, 12.89f, 18.02f, 12.71f, 18.21f)
                close()
                moveTo(12.71f, 14.71f)
                curveTo(12.66f, 14.75f, 12.61f, 14.79f, 12.56f, 14.83f)
                curveTo(12.5f, 14.87f, 12.44f, 14.9f, 12.38f, 14.92f)
                curveTo(12.32f, 14.95f, 12.26f, 14.97f, 12.2f, 14.98f)
                curveTo(12.13f, 14.99f, 12.07f, 15f, 12f, 15f)
                curveTo(11.74f, 15f, 11.48f, 14.89f, 11.29f, 14.71f)
                curveTo(11.11f, 14.52f, 11f, 14.26f, 11f, 14f)
                curveTo(11f, 13.74f, 11.11f, 13.48f, 11.29f, 13.29f)
                curveTo(11.38f, 13.2f, 11.49f, 13.13f, 11.62f, 13.08f)
                curveTo(11.99f, 12.92f, 12.43f, 13.01f, 12.71f, 13.29f)
                curveTo(12.89f, 13.48f, 13f, 13.74f, 13f, 14f)
                curveTo(13f, 14.26f, 12.89f, 14.52f, 12.71f, 14.71f)
                close()
                moveTo(16.21f, 18.21f)
                curveTo(16.02f, 18.39f, 15.76f, 18.5f, 15.5f, 18.5f)
                curveTo(15.24f, 18.5f, 14.98f, 18.39f, 14.79f, 18.21f)
                curveTo(14.61f, 18.02f, 14.5f, 17.76f, 14.5f, 17.5f)
                curveTo(14.5f, 17.24f, 14.61f, 16.98f, 14.79f, 16.79f)
                curveTo(15.16f, 16.42f, 15.84f, 16.42f, 16.21f, 16.79f)
                curveTo(16.39f, 16.98f, 16.5f, 17.24f, 16.5f, 17.5f)
                curveTo(16.5f, 17.76f, 16.39f, 18.02f, 16.21f, 18.21f)
                close()
                moveTo(16.21f, 14.71f)
                curveTo(16.16f, 14.75f, 16.11f, 14.79f, 16.06f, 14.83f)
                curveTo(16f, 14.87f, 15.94f, 14.9f, 15.88f, 14.92f)
                curveTo(15.82f, 14.95f, 15.76f, 14.97f, 15.7f, 14.98f)
                curveTo(15.63f, 14.99f, 15.56f, 15f, 15.5f, 15f)
                curveTo(15.24f, 15f, 14.98f, 14.89f, 14.79f, 14.71f)
                curveTo(14.61f, 14.52f, 14.5f, 14.26f, 14.5f, 14f)
                curveTo(14.5f, 13.74f, 14.61f, 13.48f, 14.79f, 13.29f)
                curveTo(14.89f, 13.2f, 14.99f, 13.13f, 15.12f, 13.08f)
                curveTo(15.3f, 13f, 15.5f, 12.98f, 15.7f, 13.02f)
                curveTo(15.76f, 13.03f, 15.82f, 13.05f, 15.88f, 13.08f)
                curveTo(15.94f, 13.1f, 16f, 13.13f, 16.06f, 13.17f)
                curveTo(16.11f, 13.21f, 16.16f, 13.25f, 16.21f, 13.29f)
                curveTo(16.39f, 13.48f, 16.5f, 13.74f, 16.5f, 14f)
                curveTo(16.5f, 14.26f, 16.39f, 14.52f, 16.21f, 14.71f)
                close()
            }
        }.build()

        return _Calendar!!
    }

@Suppress("ObjectPropertyName")
private var _Calendar: ImageVector? = null
