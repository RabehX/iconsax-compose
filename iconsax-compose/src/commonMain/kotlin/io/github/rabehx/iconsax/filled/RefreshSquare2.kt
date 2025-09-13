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


val Iconsax.Filled.RefreshSquare2: ImageVector
    get() {
        if (_RefreshSquare2 != null) {
            return _RefreshSquare2!!
        }
        _RefreshSquare2 = ImageVector.Builder(
            name = "Filled.RefreshSquare2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.19f, 2f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2f, 2f, 4.17f, 2f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2f, 19.83f, 4.17f, 22f, 7.81f, 22f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22f, 4.17f, 19.83f, 2f, 16.19f, 2f)
                close()
                moveTo(5.25f, 11.89f)
                curveTo(5.28f, 10.13f, 5.98f, 8.47f, 7.22f, 7.23f)
                curveTo(8.5f, 5.95f, 10.2f, 5.25f, 12f, 5.25f)
                curveTo(13.8f, 5.25f, 15.5f, 5.95f, 16.77f, 7.23f)
                curveTo(16.8f, 7.26f, 16.83f, 7.3f, 16.86f, 7.34f)
                verticalLineTo(6.48f)
                curveTo(16.86f, 6.07f, 17.2f, 5.73f, 17.61f, 5.73f)
                curveTo(18.02f, 5.73f, 18.36f, 6.07f, 18.36f, 6.48f)
                verticalLineTo(9.13f)
                curveTo(18.36f, 9.54f, 18.02f, 9.88f, 17.61f, 9.88f)
                horizontalLineTo(14.96f)
                curveTo(14.55f, 9.88f, 14.21f, 9.54f, 14.21f, 9.13f)
                curveTo(14.21f, 8.72f, 14.55f, 8.38f, 14.96f, 8.38f)
                horizontalLineTo(15.79f)
                curveTo(15.76f, 8.35f, 15.74f, 8.32f, 15.71f, 8.29f)
                curveTo(14.72f, 7.3f, 13.4f, 6.75f, 12f, 6.75f)
                curveTo(10.6f, 6.75f, 9.28f, 7.3f, 8.29f, 8.29f)
                curveTo(7.32f, 9.26f, 6.78f, 10.55f, 6.76f, 11.92f)
                curveTo(6.75f, 12.32f, 6.41f, 12.65f, 6f, 12.65f)
                horizontalLineTo(5.99f)
                curveTo(5.58f, 12.65f, 5.25f, 12.3f, 5.25f, 11.89f)
                close()
                moveTo(16.77f, 16.77f)
                curveTo(15.5f, 18.04f, 13.8f, 18.75f, 12f, 18.75f)
                curveTo(10.2f, 18.75f, 8.5f, 18.05f, 7.23f, 16.77f)
                curveTo(7.2f, 16.74f, 7.17f, 16.7f, 7.14f, 16.66f)
                verticalLineTo(17.51f)
                curveTo(7.14f, 17.92f, 6.8f, 18.26f, 6.39f, 18.26f)
                curveTo(5.98f, 18.26f, 5.64f, 17.92f, 5.64f, 17.51f)
                verticalLineTo(14.86f)
                curveTo(5.64f, 14.45f, 5.98f, 14.11f, 6.39f, 14.11f)
                horizontalLineTo(9.04f)
                curveTo(9.45f, 14.11f, 9.79f, 14.45f, 9.79f, 14.86f)
                curveTo(9.79f, 15.27f, 9.45f, 15.61f, 9.04f, 15.61f)
                horizontalLineTo(8.21f)
                curveTo(8.24f, 15.64f, 8.26f, 15.67f, 8.29f, 15.7f)
                curveTo(9.28f, 16.69f, 10.6f, 17.24f, 12f, 17.24f)
                curveTo(13.4f, 17.24f, 14.72f, 16.69f, 15.71f, 15.7f)
                curveTo(16.69f, 14.72f, 17.24f, 13.41f, 17.24f, 12.01f)
                curveTo(17.24f, 11.6f, 17.58f, 11.26f, 17.99f, 11.26f)
                curveTo(18.4f, 11.26f, 18.74f, 11.6f, 18.74f, 12.01f)
                curveTo(18.74f, 13.82f, 18.04f, 15.51f, 16.77f, 16.77f)
                close()
            }
        }.build()

        return _RefreshSquare2!!
    }

@Suppress("ObjectPropertyName")
private var _RefreshSquare2: ImageVector? = null
