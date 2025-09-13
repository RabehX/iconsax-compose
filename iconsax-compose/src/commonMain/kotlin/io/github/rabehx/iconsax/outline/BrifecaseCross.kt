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

val Iconsax.Outline.BrifecaseCross: ImageVector
    get() {
        if (_BrifecaseCross != null) {
            return _BrifecaseCross!!
        }
        _BrifecaseCross = ImageVector.Builder(
            name = "Outline.BrifecaseCross",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 18.95f)
                curveTo(9.38f, 18.95f, 7.25f, 16.82f, 7.25f, 14.2f)
                curveTo(7.25f, 11.58f, 9.38f, 9.45f, 12f, 9.45f)
                curveTo(14.62f, 9.45f, 16.75f, 11.58f, 16.75f, 14.2f)
                curveTo(16.75f, 16.82f, 14.62f, 18.95f, 12f, 18.95f)
                close()
                moveTo(12f, 10.95f)
                curveTo(10.21f, 10.95f, 8.75f, 12.41f, 8.75f, 14.2f)
                curveTo(8.75f, 15.99f, 10.21f, 17.45f, 12f, 17.45f)
                curveTo(13.79f, 17.45f, 15.25f, 15.99f, 15.25f, 14.2f)
                curveTo(15.25f, 12.41f, 13.79f, 10.95f, 12f, 10.95f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.07f, 16.06f)
                curveTo(12.88f, 16.06f, 12.69f, 15.99f, 12.54f, 15.84f)
                lineTo(10.43f, 13.73f)
                curveTo(10.14f, 13.44f, 10.14f, 12.96f, 10.43f, 12.67f)
                curveTo(10.72f, 12.38f, 11.2f, 12.38f, 11.49f, 12.67f)
                lineTo(13.6f, 14.78f)
                curveTo(13.89f, 15.07f, 13.89f, 15.55f, 13.6f, 15.84f)
                curveTo(13.45f, 15.99f, 13.26f, 16.06f, 13.07f, 16.06f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.929f, 16.09f)
                curveTo(10.739f, 16.09f, 10.549f, 16.02f, 10.399f, 15.87f)
                curveTo(10.109f, 15.58f, 10.109f, 15.1f, 10.399f, 14.81f)
                lineTo(12.509f, 12.7f)
                curveTo(12.799f, 12.41f, 13.279f, 12.41f, 13.569f, 12.7f)
                curveTo(13.859f, 12.99f, 13.859f, 13.47f, 13.569f, 13.76f)
                lineTo(11.459f, 15.87f)
                curveTo(11.309f, 16.01f, 11.119f, 16.09f, 10.929f, 16.09f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 22.75f)
                horizontalLineTo(8f)
                curveTo(3.38f, 22.75f, 2.52f, 20.6f, 2.3f, 18.51f)
                lineTo(1.55f, 10.5f)
                curveTo(1.44f, 9.45f, 1.41f, 7.9f, 2.45f, 6.74f)
                curveTo(3.35f, 5.74f, 4.84f, 5.26f, 7f, 5.26f)
                horizontalLineTo(17f)
                curveTo(19.17f, 5.26f, 20.66f, 5.75f, 21.55f, 6.74f)
                curveTo(22.59f, 7.9f, 22.56f, 9.45f, 22.45f, 10.51f)
                lineTo(21.7f, 18.5f)
                curveTo(21.48f, 20.6f, 20.62f, 22.75f, 16f, 22.75f)
                close()
                moveTo(7f, 6.75f)
                curveTo(5.31f, 6.75f, 4.15f, 7.08f, 3.56f, 7.74f)
                curveTo(3.07f, 8.28f, 2.91f, 9.11f, 3.04f, 10.35f)
                lineTo(3.79f, 18.36f)
                curveTo(3.96f, 19.94f, 4.39f, 21.25f, 8f, 21.25f)
                horizontalLineTo(16f)
                curveTo(19.6f, 21.25f, 20.04f, 19.94f, 20.21f, 18.35f)
                lineTo(20.96f, 10.36f)
                curveTo(21.09f, 9.11f, 20.93f, 8.28f, 20.44f, 7.74f)
                curveTo(19.85f, 7.08f, 18.69f, 6.75f, 17f, 6.75f)
                horizontalLineTo(7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 6.75f)
                curveTo(15.59f, 6.75f, 15.25f, 6.41f, 15.25f, 6f)
                verticalLineTo(5.2f)
                curveTo(15.25f, 3.42f, 15.25f, 2.75f, 12.8f, 2.75f)
                horizontalLineTo(11.2f)
                curveTo(8.75f, 2.75f, 8.75f, 3.42f, 8.75f, 5.2f)
                verticalLineTo(6f)
                curveTo(8.75f, 6.41f, 8.41f, 6.75f, 8f, 6.75f)
                curveTo(7.59f, 6.75f, 7.25f, 6.41f, 7.25f, 6f)
                verticalLineTo(5.2f)
                curveTo(7.25f, 3.44f, 7.25f, 1.25f, 11.2f, 1.25f)
                horizontalLineTo(12.8f)
                curveTo(16.75f, 1.25f, 16.75f, 3.44f, 16.75f, 5.2f)
                verticalLineTo(6f)
                curveTo(16.75f, 6.41f, 16.41f, 6.75f, 16f, 6.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.01f, 14.39f)
                curveTo(15.67f, 14.39f, 15.37f, 14.16f, 15.281f, 13.82f)
                curveTo(15.181f, 13.42f, 15.42f, 13.01f, 15.821f, 12.91f)
                curveTo(17.771f, 12.42f, 19.58f, 11.57f, 21.201f, 10.39f)
                curveTo(21.531f, 10.15f, 22.01f, 10.22f, 22.25f, 10.56f)
                curveTo(22.49f, 10.89f, 22.42f, 11.36f, 22.08f, 11.61f)
                curveTo(20.301f, 12.9f, 18.32f, 13.83f, 16.181f, 14.37f)
                curveTo(16.131f, 14.38f, 16.07f, 14.39f, 16.01f, 14.39f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.001f, 14.42f)
                curveTo(7.941f, 14.42f, 7.881f, 14.41f, 7.821f, 14.4f)
                curveTo(5.811f, 13.91f, 3.921f, 13.06f, 2.191f, 11.88f)
                curveTo(1.851f, 11.65f, 1.761f, 11.18f, 1.991f, 10.84f)
                curveTo(2.221f, 10.5f, 2.691f, 10.41f, 3.031f, 10.64f)
                curveTo(4.611f, 11.72f, 6.331f, 12.49f, 8.171f, 12.94f)
                curveTo(8.571f, 13.04f, 8.821f, 13.44f, 8.721f, 13.85f)
                curveTo(8.651f, 14.19f, 8.341f, 14.42f, 8.001f, 14.42f)
                close()
            }
        }.build()

        return _BrifecaseCross!!
    }

@Suppress("ObjectPropertyName")
private var _BrifecaseCross: ImageVector? = null
