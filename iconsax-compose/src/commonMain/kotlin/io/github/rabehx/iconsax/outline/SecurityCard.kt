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

val Iconsax.Outline.SecurityCard: ImageVector
    get() {
        if (_SecurityCard != null) {
            return _SecurityCard!!
        }
        _SecurityCard = ImageVector.Builder(
            name = "Outline.SecurityCard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.56f, 22.71f)
                curveTo(9.48f, 22.71f, 8.39f, 22.4f, 7.55f, 21.77f)
                lineTo(3.27f, 18.57f)
                curveTo(2.14f, 17.73f, 1.26f, 15.96f, 1.26f, 14.54f)
                verticalLineTo(7.13f)
                curveTo(1.26f, 5.6f, 2.38f, 3.97f, 3.82f, 3.43f)
                lineTo(8.8f, 1.56f)
                curveTo(9.79f, 1.19f, 11.34f, 1.19f, 12.33f, 1.56f)
                lineTo(17.3f, 3.43f)
                curveTo(18.47f, 3.87f, 19.46f, 5.04f, 19.78f, 6.34f)
                curveTo(19.83f, 6.56f, 19.78f, 6.8f, 19.64f, 6.98f)
                curveTo(19.5f, 7.16f, 19.28f, 7.27f, 19.05f, 7.27f)
                lineTo(11.14f, 7.28f)
                curveTo(9.87f, 7.36f, 9.56f, 7.57f, 9.56f, 9.42f)
                verticalLineTo(14.85f)
                curveTo(9.56f, 16.76f, 9.81f, 17f, 11.75f, 17f)
                horizontalLineTo(17.67f)
                curveTo(17.98f, 17f, 18.26f, 17.19f, 18.37f, 17.48f)
                curveTo(18.48f, 17.77f, 18.4f, 18.1f, 18.17f, 18.31f)
                curveTo(18.06f, 18.4f, 17.97f, 18.49f, 17.86f, 18.57f)
                lineTo(13.58f, 21.78f)
                curveTo(12.72f, 22.4f, 11.64f, 22.71f, 10.56f, 22.71f)
                close()
                moveTo(10.56f, 2.79f)
                curveTo(10.11f, 2.79f, 9.65f, 2.85f, 9.32f, 2.98f)
                lineTo(4.34f, 4.85f)
                curveTo(3.5f, 5.17f, 2.75f, 6.24f, 2.75f, 7.15f)
                verticalLineTo(14.56f)
                curveTo(2.75f, 15.5f, 3.41f, 16.82f, 4.16f, 17.38f)
                lineTo(8.44f, 20.58f)
                curveTo(9.59f, 21.43f, 11.52f, 21.43f, 12.67f, 20.58f)
                lineTo(15.44f, 18.51f)
                horizontalLineTo(11.74f)
                curveTo(8.98f, 18.51f, 8.05f, 17.59f, 8.05f, 14.86f)
                verticalLineTo(9.43f)
                curveTo(8.05f, 7.3f, 8.56f, 5.95f, 11.09f, 5.79f)
                lineTo(11.74f, 5.78f)
                horizontalLineTo(17.89f)
                curveTo(17.59f, 5.35f, 17.19f, 5.01f, 16.77f, 4.85f)
                lineTo(11.8f, 2.98f)
                curveTo(11.46f, 2.85f, 11.01f, 2.79f, 10.56f, 2.79f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22.001f, 11.97f)
                horizontalLineTo(8.801f)
                curveTo(8.391f, 11.97f, 8.051f, 11.63f, 8.051f, 11.22f)
                curveTo(8.051f, 10.81f, 8.391f, 10.47f, 8.801f, 10.47f)
                horizontalLineTo(22.001f)
                curveTo(22.411f, 10.47f, 22.751f, 10.81f, 22.751f, 11.22f)
                curveTo(22.751f, 11.63f, 22.411f, 11.97f, 22.001f, 11.97f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.061f, 18.5f)
                horizontalLineTo(11.741f)
                curveTo(8.981f, 18.5f, 8.051f, 17.58f, 8.051f, 14.85f)
                verticalLineTo(9.42f)
                curveTo(8.051f, 7.29f, 8.561f, 5.94f, 11.091f, 5.78f)
                lineTo(11.741f, 5.77f)
                horizontalLineTo(19.061f)
                curveTo(21.821f, 5.77f, 22.751f, 6.69f, 22.751f, 9.42f)
                verticalLineTo(14.97f)
                curveTo(22.731f, 17.61f, 21.801f, 18.5f, 19.061f, 18.5f)
                close()
                moveTo(11.741f, 7.27f)
                lineTo(11.131f, 7.28f)
                curveTo(9.861f, 7.36f, 9.551f, 7.57f, 9.551f, 9.42f)
                verticalLineTo(14.85f)
                curveTo(9.551f, 16.76f, 9.801f, 17f, 11.741f, 17f)
                horizontalLineTo(19.061f)
                curveTo(20.971f, 17f, 21.231f, 16.75f, 21.251f, 14.97f)
                verticalLineTo(9.43f)
                curveTo(21.251f, 7.52f, 21.001f, 7.28f, 19.061f, 7.28f)
                horizontalLineTo(11.741f)
                verticalLineTo(7.27f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.651f, 16.01f)
                horizontalLineTo(11.311f)
                curveTo(10.901f, 16.01f, 10.561f, 15.67f, 10.561f, 15.26f)
                curveTo(10.561f, 14.85f, 10.901f, 14.51f, 11.311f, 14.51f)
                horizontalLineTo(12.651f)
                curveTo(13.061f, 14.51f, 13.401f, 14.85f, 13.401f, 15.26f)
                curveTo(13.401f, 15.67f, 13.071f, 16.01f, 12.651f, 16.01f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.02f, 16.01f)
                horizontalLineTo(14.75f)
                curveTo(14.34f, 16.01f, 14f, 15.67f, 14f, 15.26f)
                curveTo(14f, 14.85f, 14.34f, 14.51f, 14.75f, 14.51f)
                horizontalLineTo(18.02f)
                curveTo(18.43f, 14.51f, 18.77f, 14.85f, 18.77f, 15.26f)
                curveTo(18.77f, 15.67f, 18.44f, 16.01f, 18.02f, 16.01f)
                close()
            }
        }.build()

        return _SecurityCard!!
    }

@Suppress("ObjectPropertyName")
private var _SecurityCard: ImageVector? = null
